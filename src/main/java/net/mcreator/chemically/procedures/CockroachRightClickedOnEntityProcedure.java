package net.mcreator.chemically.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CockroachRightClickedOnEntityProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == ChemicallyModItems.HAT.get()) {
			entity.getPersistentData().putBoolean("hatted", true);
			itemstack.shrink(1);
		} else if (entity.getPersistentData().getBoolean("hatted")) {
			entity.getPersistentData().putBoolean("hatted", false);
		}
	}
}
