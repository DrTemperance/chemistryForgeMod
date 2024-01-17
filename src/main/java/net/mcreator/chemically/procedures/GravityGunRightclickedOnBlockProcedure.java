package net.mcreator.chemically.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.chemically.ChemicallyMod;

public class GravityGunRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		BlockState clickedBlock = Blocks.AIR.defaultBlockState();
		if (!itemstack.getOrCreateTag().getBoolean("active")) {
			clickedBlock = (world.getBlockState(BlockPos.containing(x, y, z)));
			world.setBlock(BlockPos.containing(x, y, z), (world.getFluidState(BlockPos.containing(x, y, z)).createLegacyBlock()), 3);
			if (world instanceof ServerLevel _level)
				FallingBlockEntity.fall(_level, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), clickedBlock);
			ChemicallyMod.queueServerWork(3, () -> {
				itemstack.getOrCreateTag().putBoolean("active", true);
			});
		}
	}
}
