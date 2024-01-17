package net.mcreator.chemically.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class LithiumIonBatteryRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("Energy", (new Object() {
			public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
				return _retval.get();
			}
		}.receiveEnergySimulate(world, BlockPos.containing(x, y, z), (int) itemstack.getOrCreateTag().getDouble("Energy"))));
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
			int _amount = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(world, BlockPos.containing(x, y, z), (int) itemstack.getOrCreateTag().getDouble("Energy"));
			if (_ent != null)
				_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
		}
	}
}
