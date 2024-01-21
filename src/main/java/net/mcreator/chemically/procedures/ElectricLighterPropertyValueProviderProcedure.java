package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;

public class ElectricLighterPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getBoolean("open") ? 1 : 0;
	}
}
