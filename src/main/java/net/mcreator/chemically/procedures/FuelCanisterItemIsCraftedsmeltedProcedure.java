package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;

public class FuelCanisterItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("Fuel", 0);
	}
}
