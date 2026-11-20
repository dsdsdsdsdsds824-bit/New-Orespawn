package danger.orespawn;

import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettingsBuilder;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Geracao de minerios no Overworld. Os valores (tamanho da veia, quantidade por chunk e altura)
 * sao os padroes do OreSpawn 1.7.10.
 */
@Mod.EventBusSubscriber(modid = OreSpawn.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class OreGeneration {
    private static ConfiguredFeature<?, ?> SALT_ORE_FEATURE;
    private static ConfiguredFeature<?, ?> RUBY_ORE_FEATURE;
    private static ConfiguredFeature<?, ?> RUBY_BLOCK_FEATURE;
    private static ConfiguredFeature<?, ?> URANIUM_ORE_FEATURE;
    private static ConfiguredFeature<?, ?> TITANIUM_ORE_FEATURE;
    private static ConfiguredFeature<?, ?> AMETHYST_ORE_FEATURE;

    /** Registra as features configuradas (exigido pelo Forge 1.16.2+). Chamado no setup comum. */
    public static void registerFeatures() {
        SALT_ORE_FEATURE = register("salt_ore", ModBlocks.SALT_ORE.get(), 12, 5, 50, 128);
        RUBY_ORE_FEATURE = register("ruby_ore", ModBlocks.RUBY_ORE.get(), 1, 10, 0, 50);
        RUBY_BLOCK_FEATURE = register("ruby_block", ModBlocks.RUBY_BLOCK.get(), 2, 1, 0, 15);
        URANIUM_ORE_FEATURE = register("uranium_ore", ModBlocks.URANIUM_ORE.get(), 4, 3, 0, 30);
        TITANIUM_ORE_FEATURE = register("titanium_ore", ModBlocks.TITANIUM_ORE.get(), 4, 3, 0, 20);
        AMETHYST_ORE_FEATURE = register("amethyst_ore", ModBlocks.AMETHYST_ORE.get(), 6, 2, 0, 25);
    }

    private static ConfiguredFeature<?, ?> register(String name, Block block, int veinSize, int count, int minY, int maxY) {
        ConfiguredFeature<?, ?> feature = Feature.ORE
                .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, block.getDefaultState(), veinSize))
                // TopSolidRangeConfig(deslocamentoInferior, deslocamentoSuperior, maximo): y = random(maximo) + deslocamentoInferior
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minY, 0, maxY - minY)))
                .square()
                .count(count);
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(OreSpawn.MODID, name), feature);
    }

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onBiomeLoading(BiomeLoadingEvent event) {
        Biome.Category category = event.getCategory();
        if (category == Biome.Category.NETHER || category == Biome.Category.THEEND) {
            return;
        }
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SALT_ORE_FEATURE);
        generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, RUBY_ORE_FEATURE);
        generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, RUBY_BLOCK_FEATURE);
        generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, URANIUM_ORE_FEATURE);
        generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, TITANIUM_ORE_FEATURE);
        generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, AMETHYST_ORE_FEATURE);
    }

    private OreGeneration() {
    }
}
