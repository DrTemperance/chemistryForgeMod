package net.mcreator.chemically.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.chemically.init.ChemicallyModBlocks;

public class AcceleratorEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			Vec3 motion = entity.getDeltaMovement().scale(0);
			entity.setDeltaMovement(motion);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ChemicallyModBlocks.POLARITY_DEVICE.get()) {
			Vec3 motion = entity.getDeltaMovement().scale((-2));
			entity.setDeltaMovement(motion);
		} else {
			Vec3 motion = entity.getDeltaMovement().scale(2);
			entity.setDeltaMovement(motion);
		}
	}
}
