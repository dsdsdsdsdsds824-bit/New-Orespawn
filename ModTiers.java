package danger.orespawn;

import java.util.function.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

/** Materiais de ferramenta, com os atributos originais do OreSpawn 1.7.10 (nivel, usos, eficiencia, dano, encantamento). */
public enum ModTiers implements IItemTier {
    CRYSTAL_WOOD(2, 300, 3.0F, 2.0F, 15, () -> Ingredient.fromItems(ModBlocks.CRYSTAL_PLANKS.get().asItem())),
    CRYSTAL_STONE(3, 800, 6.0F, 5.0F, 45, () -> Ingredient.fromItems(ModBlocks.CRYSTAL_STONE.get().asItem())),
    CRYSTAL_PINK(4, 1100, 10.0F, 7.0F, 65, () -> Ingredient.fromItems(ModItems.CRYSTAL_PINK_INGOT.get())),
    TIGERS_EYE(4, 1600, 12.0F, 8.0F, 75, () -> Ingredient.fromItems(ModItems.TIGERS_EYE_INGOT.get())),
    RUBY(5, 1500, 11.0F, 16.0F, 85, () -> Ingredient.fromItems(ModItems.RUBY.get())),
    AMETHYST(4, 2000, 11.0F, 11.0F, 70, () -> Ingredient.fromItems(ModItems.AMETHYST.get())),
    EMERALD(3, 1300, 10.0F, 6.0F, 75, () -> Ingredient.fromItems(Items.EMERALD)),
    ULTIMATE(10, 3000, 15.0F, 36.0F, 100, () -> Ingredient.fromItems(ModItems.TITANIUM_INGOT.get()));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    ModTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repair) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repair);
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }
}
