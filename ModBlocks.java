package danger.orespawn;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/** Blocos do mod (gerado a partir da tabela de blocos do OreSpawn 1.7.10). */
public final class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OreSpawn.MODID);
    /** Blocos que precisam de camada de renderizacao com transparencia. */
    public static final List<RegistryObject<Block>> CUTOUT = new ArrayList<>();

    public static final RegistryObject<Block> SALT_ORE = reg("salt_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 2.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()), false);
    public static final RegistryObject<Block> RUBY_ORE = reg("ruby_ore", () -> new GemOreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(10.0F, 4.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool(), 5, 13), false);
    public static final RegistryObject<Block> AMETHYST_ORE = reg("amethyst_ore", () -> new GemOreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(10.0F, 4.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool(), 5, 13), false);
    public static final RegistryObject<Block> URANIUM_ORE = reg("uranium_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(10.0F, 1.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()), false);
    public static final RegistryObject<Block> TITANIUM_ORE = reg("titanium_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(15.0F, 5.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()), false);
    public static final RegistryObject<Block> RUBY_BLOCK = reg("ruby_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(4.0F, 4.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool().setLightLevel(state -> 6).notSolid().setOpaque((state, world, pos) -> false)), true);
    public static final RegistryObject<Block> AMETHYST_BLOCK = reg("amethyst_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(4.0F, 4.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool().setLightLevel(state -> 6).notSolid().setOpaque((state, world, pos) -> false)), true);
    public static final RegistryObject<Block> MOBZILLA_SCALE_BLOCK = reg("mobzilla_scale_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(4.0F, 4.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool().setLightLevel(state -> 6).notSolid().setOpaque((state, world, pos) -> false)), true);
    public static final RegistryObject<Block> URANIUM_BLOCK = reg("uranium_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 5.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool().setLightLevel(state -> 3)), false);
    public static final RegistryObject<Block> TITANIUM_BLOCK = reg("titanium_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 5.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool().setLightLevel(state -> 8)), false);
    public static final RegistryObject<Block> CRYSTAL_PINK_BLOCK = reg("crystal_pink_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(4.0F, 4.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool().setLightLevel(state -> 6).notSolid().setOpaque((state, world, pos) -> false)), true);
    public static final RegistryObject<Block> TIGERS_EYE_BLOCK = reg("tigers_eye_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(4.0F, 4.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool().setLightLevel(state -> 6).notSolid().setOpaque((state, world, pos) -> false)), true);
    public static final RegistryObject<Block> CRYSTAL_STONE = reg("crystal_stone", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()), false);
    public static final RegistryObject<Block> CRYSTAL_PLANKS = reg("crystal_planks", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 4.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).notSolid().setOpaque((state, world, pos) -> false)), true);
    public static final RegistryObject<Block> CRYSTAL_COAL = reg("crystal_coal", () -> new CrystalBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(6.0F, 20.0F).sound(SoundType.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool().setLightLevel(state -> 9).notSolid().setOpaque((state, world, pos) -> false), 0.3333F, 1.5F), true);
    public static final RegistryObject<Block> CRYSTAL_CRYSTAL = reg("crystal_crystal", () -> new CrystalBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(12.0F, 40.0F).sound(SoundType.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool().setLightLevel(state -> 6).notSolid().setOpaque((state, world, pos) -> false), 0.1000F, 1.0F), true);
    public static final RegistryObject<Block> TIGERS_EYE_ORE = reg("tigers_eye_ore", () -> new CrystalBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(15.0F, 60.0F).sound(SoundType.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool().setLightLevel(state -> 8).notSolid().setOpaque((state, world, pos) -> false), 0.0000F, 0.0F), true);

    private static RegistryObject<Block> reg(String name, Supplier<Block> supplier, boolean cutout) {
        RegistryObject<Block> object = BLOCKS.register(name, supplier);
        if (cutout) {
            CUTOUT.add(object);
        }
        return object;
    }

    private ModBlocks() {
    }
}
