package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;

public class BeakerItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("content1", 0);
		itemstack.getOrCreateTag().putDouble("content2", 0);
		itemstack.getOrCreateTag().putDouble("content3", 0);
	}
}
