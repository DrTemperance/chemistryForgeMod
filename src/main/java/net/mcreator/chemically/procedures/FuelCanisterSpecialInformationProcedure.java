package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;

public class FuelCanisterSpecialInformationProcedure {
	public static String execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("Fuel") + "/" + itemstack.getOrCreateTag().getDouble("MaxFuel") + " Fuel";
	}
}
