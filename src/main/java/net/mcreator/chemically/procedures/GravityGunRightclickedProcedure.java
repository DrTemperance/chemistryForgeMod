package net.mcreator.chemically.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;

import net.mcreator.chemically.ChemicallyMod;

public class GravityGunRightclickedProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("active")) {
			ChemicallyMod.queueServerWork(3, () -> {
				itemstack.getOrCreateTag().putBoolean("active", false);
			});
		}
	}
}
