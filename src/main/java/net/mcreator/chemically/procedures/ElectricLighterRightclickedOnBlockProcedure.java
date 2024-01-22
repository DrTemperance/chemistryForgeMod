package net.mcreator.chemically.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ElectricLighterRightclickedOnBlockProcedure {
	public static InteractionResult execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("active") && itemstack.getOrCreateTag().getDouble("energy") >= 1) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
				itemstack.getOrCreateTag().putDouble("tagName", (itemstack.getOrCreateTag().getDouble("energy") - 1));
				return InteractionResult.SUCCESS;
			} else {
				return InteractionResult.FAIL;
			}
		}
		return InteractionResult.FAIL;
	}
}
