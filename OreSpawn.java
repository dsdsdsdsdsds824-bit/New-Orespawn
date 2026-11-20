package danger.orespawn;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafml.FMLJavaModLoadingContext;

@Mod(OreSpawn.MODID)
public class OreSpawn {
    public static final String MODID = "orespawn";

    public static final ItemGroup TAB = new ItemGroup("orespawn") {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }
    };

    public OreSpawn() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(modBus);
        ModItems.ITEMS.register(modBus);
        modBus.addListener(this::commonSetup);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(OreGeneration::registerFeatures);
    }
}
