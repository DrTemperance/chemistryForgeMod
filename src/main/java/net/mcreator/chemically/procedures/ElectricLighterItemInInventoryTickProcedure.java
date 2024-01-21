package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class ElectricLighterItemInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.getOrCreateTag().putDouble("MaxEnergy", 500);
		if (itemstack.getOrCreateTag().getBoolean("active") && (!(itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) || itemstack.getOrCreateTag().getDouble("energy") <= 0)) {
			itemstack.getOrCreateTag().putBoolean("active", false);
		}
	}
}
