package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;

public class ElectricLighterActivePropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getBoolean("active") ? 1 : 0;
	}
}
