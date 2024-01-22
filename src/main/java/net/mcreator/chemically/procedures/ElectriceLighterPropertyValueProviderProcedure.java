package net.mcreator.chemically.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ElectriceLighterPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("MaxEnergy");
	}
}
