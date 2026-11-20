package danger.orespawn;

import java.util.function.Supplier;

import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/** Itens do mod: materiais, ferramentas, armaduras e itens de bloco. */
public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OreSpawn.MODID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(props()));
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", () -> new Item(props()));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt", () -> new Item(props()));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new Item(props()));
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", () -> new Item(props()));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new Item(props()));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", () -> new Item(props()));
    public static final RegistryObject<Item> CRYSTAL_PINK_INGOT = ITEMS.register("crystal_pink_ingot", () -> new Item(props()));
    public static final RegistryObject<Item> TIGERS_EYE_INGOT = ITEMS.register("tigers_eye_ingot", () -> new Item(props()));
    public static final RegistryObject<Item> CRYSTAL_STICKS = ITEMS.register("crystal_sticks", () -> new Item(props()));

    public static final RegistryObject<Item> SALT_ORE_ITEM = blockItem("salt_ore", ModBlocks.SALT_ORE);
    public static final RegistryObject<Item> RUBY_ORE_ITEM = blockItem("ruby_ore", ModBlocks.RUBY_ORE);
    public static final RegistryObject<Item> AMETHYST_ORE_ITEM = blockItem("amethyst_ore", ModBlocks.AMETHYST_ORE);
    public static final RegistryObject<Item> URANIUM_ORE_ITEM = blockItem("uranium_ore", ModBlocks.URANIUM_ORE);
    public static final RegistryObject<Item> TITANIUM_ORE_ITEM = blockItem("titanium_ore", ModBlocks.TITANIUM_ORE);
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = blockItem("ruby_block", ModBlocks.RUBY_BLOCK);
    public static final RegistryObject<Item> AMETHYST_BLOCK_ITEM = blockItem("amethyst_block", ModBlocks.AMETHYST_BLOCK);
    public static final RegistryObject<Item> MOBZILLA_SCALE_BLOCK_ITEM = blockItem("mobzilla_scale_block", ModBlocks.MOBZILLA_SCALE_BLOCK);
    public static final RegistryObject<Item> URANIUM_BLOCK_ITEM = blockItem("uranium_block", ModBlocks.URANIUM_BLOCK);
    public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM = blockItem("titanium_block", ModBlocks.TITANIUM_BLOCK);
    public static final RegistryObject<Item> CRYSTAL_PINK_BLOCK_ITEM = blockItem("crystal_pink_block", ModBlocks.CRYSTAL_PINK_BLOCK);
    public static final RegistryObject<Item> TIGERS_EYE_BLOCK_ITEM = blockItem("tigers_eye_block", ModBlocks.TIGERS_EYE_BLOCK);
    public static final RegistryObject<Item> CRYSTAL_STONE_ITEM = blockItem("crystal_stone", ModBlocks.CRYSTAL_STONE);
    public static final RegistryObject<Item> CRYSTAL_PLANKS_ITEM = blockItem("crystal_planks", ModBlocks.CRYSTAL_PLANKS);
    public static final RegistryObject<Item> CRYSTAL_COAL_ITEM = blockItem("crystal_coal", ModBlocks.CRYSTAL_COAL);
    public static final RegistryObject<Item> CRYSTAL_CRYSTAL_ITEM = blockItem("crystal_crystal", ModBlocks.CRYSTAL_CRYSTAL);
    public static final RegistryObject<Item> TIGERS_EYE_ORE_ITEM = blockItem("tigers_eye_ore", ModBlocks.TIGERS_EYE_ORE);

    public static final RegistryObject<Item> CRYSTAL_WOOD_SWORD = ITEMS.register("crystal_wood_sword", () -> new SwordItem(ModTiers.CRYSTAL_WOOD, 3, -2.4F, props()));
    public static final RegistryObject<Item> CRYSTAL_WOOD_PICKAXE = ITEMS.register("crystal_wood_pickaxe", () -> new PickaxeItem(ModTiers.CRYSTAL_WOOD, 1, -2.8F, props()));
    public static final RegistryObject<Item> CRYSTAL_WOOD_AXE = ITEMS.register("crystal_wood_axe", () -> new AxeItem(ModTiers.CRYSTAL_WOOD, 5.0F, -3.0F, props()));
    public static final RegistryObject<Item> CRYSTAL_WOOD_SHOVEL = ITEMS.register("crystal_wood_shovel", () -> new ShovelItem(ModTiers.CRYSTAL_WOOD, 1.5F, -3.0F, props()));
    public static final RegistryObject<Item> CRYSTAL_WOOD_HOE = ITEMS.register("crystal_wood_hoe", () -> new HoeItem(ModTiers.CRYSTAL_WOOD, -3, 0.0F, props()));
    public static final RegistryObject<Item> CRYSTAL_STONE_SWORD = ITEMS.register("crystal_stone_sword", () -> new SwordItem(ModTiers.CRYSTAL_STONE, 3, -2.4F, props()));
    public static final RegistryObject<Item> CRYSTAL_STONE_PICKAXE = ITEMS.register("crystal_stone_pickaxe", () -> new PickaxeItem(ModTiers.CRYSTAL_STONE, 1, -2.8F, props()));
    public static final RegistryObject<Item> CRYSTAL_STONE_AXE = ITEMS.register("crystal_stone_axe", () -> new AxeItem(ModTiers.CRYSTAL_STONE, 5.0F, -3.0F, props()));
    public static final RegistryObject<Item> CRYSTAL_STONE_SHOVEL = ITEMS.register("crystal_stone_shovel", () -> new ShovelItem(ModTiers.CRYSTAL_STONE, 1.5F, -3.0F, props()));
    public static final RegistryObject<Item> CRYSTAL_STONE_HOE = ITEMS.register("crystal_stone_hoe", () -> new HoeItem(ModTiers.CRYSTAL_STONE, -3, 0.0F, props()));
    public static final RegistryObject<Item> CRYSTAL_PINK_SWORD = ITEMS.register("crystal_pink_sword", () -> new SwordItem(ModTiers.CRYSTAL_PINK, 3, -2.4F, props()));
    public static final RegistryObject<Item> CRYSTAL_PINK_PICKAXE = ITEMS.register("crystal_pink_pickaxe", () -> new PickaxeItem(ModTiers.CRYSTAL_PINK, 1, -2.8F, props()));
    public static final RegistryObject<Item> CRYSTAL_PINK_AXE = ITEMS.register("crystal_pink_axe", () -> new AxeItem(ModTiers.CRYSTAL_PINK, 5.0F, -3.0F, props()));
    public static final RegistryObject<Item> CRYSTAL_PINK_SHOVEL = ITEMS.register("crystal_pink_shovel", () -> new ShovelItem(ModTiers.CRYSTAL_PINK, 1.5F, -3.0F, props()));
    public static final RegistryObject<Item> CRYSTAL_PINK_HOE = ITEMS.register("crystal_pink_hoe", () -> new HoeItem(ModTiers.CRYSTAL_PINK, -3, 0.0F, props()));
    public static final RegistryObject<Item> TIGERS_EYE_SWORD = ITEMS.register("tigers_eye_sword", () -> new SwordItem(ModTiers.TIGERS_EYE, 3, -2.4F, props()));
    public static final RegistryObject<Item> TIGERS_EYE_PICKAXE = ITEMS.register("tigers_eye_pickaxe", () -> new PickaxeItem(ModTiers.TIGERS_EYE, 1, -2.8F, props()));
    public static final RegistryObject<Item> TIGERS_EYE_AXE = ITEMS.register("tigers_eye_axe", () -> new AxeItem(ModTiers.TIGERS_EYE, 5.0F, -3.0F, props()));
    public static final RegistryObject<Item> TIGERS_EYE_SHOVEL = ITEMS.register("tigers_eye_shovel", () -> new ShovelItem(ModTiers.TIGERS_EYE, 1.5F, -3.0F, props()));
    public static final RegistryObject<Item> TIGERS_EYE_HOE = ITEMS.register("tigers_eye_hoe", () -> new HoeItem(ModTiers.TIGERS_EYE, -3, 0.0F, props()));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModTiers.RUBY, 3, -2.4F, props()));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModTiers.RUBY, 1, -2.8F, props()));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModTiers.RUBY, 5.0F, -3.0F, props()));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModTiers.RUBY, 1.5F, -3.0F, props()));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModTiers.RUBY, -3, 0.0F, props()));
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ModTiers.AMETHYST, 3, -2.4F, props()));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ModTiers.AMETHYST, 1, -2.8F, props()));
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(ModTiers.AMETHYST, 5.0F, -3.0F, props()));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ModTiers.AMETHYST, 1.5F, -3.0F, props()));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ModTiers.AMETHYST, -3, 0.0F, props()));
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ModTiers.EMERALD, 3, -2.4F, props()));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModTiers.EMERALD, 1, -2.8F, props()));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ModTiers.EMERALD, 5.0F, -3.0F, props()));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ModTiers.EMERALD, 1.5F, -3.0F, props()));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(ModTiers.EMERALD, -3, 0.0F, props()));
    public static final RegistryObject<Item> ULTIMATE_SWORD = ITEMS.register("ultimate_sword", () -> new SwordItem(ModTiers.ULTIMATE, 3, -2.4F, props()));
    public static final RegistryObject<Item> ULTIMATE_PICKAXE = ITEMS.register("ultimate_pickaxe", () -> new PickaxeItem(ModTiers.ULTIMATE, 1, -2.8F, props()));
    public static final RegistryObject<Item> ULTIMATE_AXE = ITEMS.register("ultimate_axe", () -> new AxeItem(ModTiers.ULTIMATE, 5.0F, -3.0F, props()));
    public static final RegistryObject<Item> ULTIMATE_SHOVEL = ITEMS.register("ultimate_shovel", () -> new ShovelItem(ModTiers.ULTIMATE, 1.5F, -3.0F, props()));
    public static final RegistryObject<Item> ULTIMATE_HOE = ITEMS.register("ultimate_hoe", () -> new HoeItem(ModTiers.ULTIMATE, -3, 0.0F, props()));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, props()));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, props()));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, props()));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, props()));
    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.HEAD, props()));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.CHEST, props()));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.LEGS, props()));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.FEET, props()));
    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, props()));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, props()));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, props()));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, props()));
    public static final RegistryObject<Item> TIGERS_EYE_HELMET = ITEMS.register("tigers_eye_helmet", () -> new ArmorItem(ModArmorMaterial.TIGERS_EYE, EquipmentSlotType.HEAD, props()));
    public static final RegistryObject<Item> TIGERS_EYE_CHESTPLATE = ITEMS.register("tigers_eye_chestplate", () -> new ArmorItem(ModArmorMaterial.TIGERS_EYE, EquipmentSlotType.CHEST, props()));
    public static final RegistryObject<Item> TIGERS_EYE_LEGGINGS = ITEMS.register("tigers_eye_leggings", () -> new ArmorItem(ModArmorMaterial.TIGERS_EYE, EquipmentSlotType.LEGS, props()));
    public static final RegistryObject<Item> TIGERS_EYE_BOOTS = ITEMS.register("tigers_eye_boots", () -> new ArmorItem(ModArmorMaterial.TIGERS_EYE, EquipmentSlotType.FEET, props()));
    public static final RegistryObject<Item> ULTIMATE_HELMET = ITEMS.register("ultimate_helmet", () -> new ArmorItem(ModArmorMaterial.ULTIMATE, EquipmentSlotType.HEAD, props()));
    public static final RegistryObject<Item> ULTIMATE_CHESTPLATE = ITEMS.register("ultimate_chestplate", () -> new ArmorItem(ModArmorMaterial.ULTIMATE, EquipmentSlotType.CHEST, props()));
    public static final RegistryObject<Item> ULTIMATE_LEGGINGS = ITEMS.register("ultimate_leggings", () -> new ArmorItem(ModArmorMaterial.ULTIMATE, EquipmentSlotType.LEGS, props()));
    public static final RegistryObject<Item> ULTIMATE_BOOTS = ITEMS.register("ultimate_boots", () -> new ArmorItem(ModArmorMaterial.ULTIMATE, EquipmentSlotType.FEET, props()));

    private static Item.Properties props() {
        return new Item.Properties().group(OreSpawn.TAB);
    }

    private static RegistryObject<Item> blockItem(String name, Supplier<Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), props()));
    }

    private ModItems() {
    }
}
