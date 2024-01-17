package net.mcreator.chemically.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.chemically.init.ChemicallyModItems;

public class BeakerSpecialInformationProcedure {
	public static void execute(ItemStack itemstack) {
		double iteration = 0;
		ItemStack IteratorOutput = ItemStack.EMPTY;
		ItemStack Item1 = ItemStack.EMPTY;
		ItemStack Item2 = ItemStack.EMPTY;
		ItemStack Item3 = ItemStack.EMPTY;
		iteration = 0;
		for (int index0 = 0; index0 < 3; index0++) {
			iteration = iteration + 1;
			if (itemstack.getOrCreateTag().getDouble(("content" + iteration)) == 0) {
				IteratorOutput = ItemStack.EMPTY;
			} else if (itemstack.getOrCreateTag().getDouble(("content" + iteration)) == 1) {
				IteratorOutput = new ItemStack(ChemicallyModItems.HYDROGEN.get());
			}
			if (iteration == 1) {
				Item1 = IteratorOutput;
			} else if (iteration == 2) {
				Item2 = IteratorOutput;
			} else if (iteration == 3) {
				Item3 = IteratorOutput;
			}
		}
	}
}
