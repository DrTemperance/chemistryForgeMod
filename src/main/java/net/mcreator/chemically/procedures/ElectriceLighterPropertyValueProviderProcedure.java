package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;

public class ElectriceLighterPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("MaxEnergy");
	}
}
