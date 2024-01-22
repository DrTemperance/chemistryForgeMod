package net.mcreator.chemically.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ElectricLighterSpecialInformationProcedure {
	public static String execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("energy") + "/" + itemstack.getOrCreateTag().getDouble("MaxEnergy");
	}
}
