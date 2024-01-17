package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.chemically.init.ChemicallyModItems;

public class InverseElementHandlerProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ChemicallyModItems.HYDROGEN.get()) {
			return 1;
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ChemicallyModItems.GAS_CYLINDER.get()) {
			return 2;
		}
		return 0;
	}
}
