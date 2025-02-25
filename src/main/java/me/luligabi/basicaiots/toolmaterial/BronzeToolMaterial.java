package me.luligabi.basicaiots.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BronzeToolMaterial implements ToolMaterial {

    public static BronzeToolMaterial INSTANCE = new BronzeToolMaterial();

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getDurability() {
        return 375;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0F;
    }

    @Override
    public float getAttackDamage() {
        return 2.25F;
    }

    @Override
    public int getEnchantability() {
        return 6;
    }

    @Override
    public Ingredient getRepairIngredient() { //TODO: Add repair item
        return null;
    }
}
