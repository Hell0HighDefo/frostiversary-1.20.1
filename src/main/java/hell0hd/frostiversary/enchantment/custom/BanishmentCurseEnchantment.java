package hell0hd.frostiversary.enchantment.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class BanishmentCurseEnchantment extends Enchantment {
    public BanishmentCurseEnchantment(Enchantment.Rarity weight, EquipmentSlot... slotTypes) {
        super(weight, EnchantmentTarget.WEAPON, slotTypes);
    }

    public int getMinPower(int level) {
        return 25;
    }

    public int getMaxPower(int level) {
        return 50;
    }

    public boolean isTreasure() {
        return true;
    }

    public boolean isCursed() {
        return true;
    }

    public boolean isAcceptableItem(ItemStack stack) {
        return !stack.isOf(Items.SHIELD) && super.isAcceptableItem(stack);
    }
}
