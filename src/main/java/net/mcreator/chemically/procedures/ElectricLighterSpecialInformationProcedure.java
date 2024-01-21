package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;

public class ElectricLighterSpecialInformationProcedure {
	public static String execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("energy") + "/" + itemstack.getOrCreateTag().getDouble("MaxEnergy");
	}
}
