package net.mcreator.chemically.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;

import net.mcreator.chemically.init.ChemicallyModItems;

public class ElementHandlerProcedure {
	public static ItemStack execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("content1") == 0) {
			return new ItemStack(Blocks.AIR);
		} else if (itemstack.getOrCreateTag().getDouble("content1") == 1) {
			return new ItemStack(ChemicallyModItems.HYDROGEN.get());
		}
		return new ItemStack(ChemicallyModItems.GAS_CYLINDER.get());
	}
}
