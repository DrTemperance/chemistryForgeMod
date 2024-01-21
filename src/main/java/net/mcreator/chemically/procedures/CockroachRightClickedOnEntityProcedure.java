package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.chemically.init.ChemicallyModItems;

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
