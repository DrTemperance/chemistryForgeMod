package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;

public class LithiumIonBatteryItemInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("Energy", Math.min(itemstack.getOrCreateTag().getDouble("Energy"), 5000));
	}
}
