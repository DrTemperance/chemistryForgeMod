package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;

public class BeakerPropertyValueProvider2Procedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("content2");
	}
}
