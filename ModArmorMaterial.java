package danger.orespawn;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/** Materiais de armadura, com os atributos originais do OreSpawn 1.7.10. */
public enum ModArmorMaterial implements IArmorMaterial {
    RUBY("ruby", 90, new int[] { 4, 8, 9, 4 }, 40, () -> Ingredient.fromItems(ModItems.RUBY.get())),
    AMETHYST("amethyst", 100, new int[] { 3, 7, 8, 4 }, 40, () -> Ingredient.fromItems(ModItems.AMETHYST.get())),
    EMERALD("emerald", 60, new int[] { 3, 6, 8, 3 }, 40, () -> Ingredient.fromItems(Items.EMERALD)),
    TIGERS_EYE("tigers_eye", 80, new int[] { 4, 7, 8, 4 }, 55, () -> Ingredient.fromItems(ModItems.TIGERS_EYE_INGOT.get())),
    ULTIMATE("ultimate", 200, new int[] { 6, 10, 12, 6 }, 100, () -> Ingredient.fromItems(ModItems.TITANIUM_INGOT.get()));

    /** Durabilidade base por peca (botas, calca, peito, capacete), como no jogo base. */
    private static final int[] MAX_DAMAGE_ARRAY = { 13, 15, 16, 11 };

    private final String name;
    private final int durabilityMultiplier;
    private final int[] damageReduction;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    ModArmorMaterial(String name, int durabilityMultiplier, int[] damageReduction, int enchantability, Supplier<Ingredient> repair) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.damageReduction = damageReduction;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repair);
    }

    @Override
    public int getDurability(EquipmentSlotType slot) {
        return MAX_DAMAGE_ARRAY[slot.getIndex()] * durabilityMultiplier;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slot) {
        return damageReduction[slot.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return OreSpawn.MODID + ":" + name;
    }

    @Override
    public float getToughness() {
        return 0.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }
}
