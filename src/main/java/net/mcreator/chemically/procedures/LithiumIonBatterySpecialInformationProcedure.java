package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;

public class LithiumIonBatterySpecialInformationProcedure {
	public static String execute(ItemStack itemstack) {
		return (itemstack.getOrCreateTag().getDouble("Energy") + "/5000" + "RF").strip();
	}
}
