package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;

public class FuelCanisterItemInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("MaxFuel", 100);
	}
}
