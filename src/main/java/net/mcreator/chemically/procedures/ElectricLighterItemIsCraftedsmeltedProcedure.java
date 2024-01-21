package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;

public class ElectricLighterItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("energy", 500);
	}
}
