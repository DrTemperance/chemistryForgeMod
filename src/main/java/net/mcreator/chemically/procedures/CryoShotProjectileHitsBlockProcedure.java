package net.mcreator.chemically.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class CryoShotProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		int horizontalRadiusSphere = (int) 4 - 1;
		int verticalRadiusSphere = (int) 4 - 1;
		int yIterationsSphere = verticalRadiusSphere;
		for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
			for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
				for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
							+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
					if (distanceSq <= 1.0) {
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FIRE) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							if (Math.random() <= 0.5 && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
								{
									BlockPos _bp = BlockPos.containing(x, y, z);
									BlockState _bs = Blocks.SNOW.defaultBlockState();
									BlockState _bso = world.getBlockState(_bp);
									for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
										Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
										if (_property != null && _bs.getValue(_property) != null)
											try {
												_bs = _bs.setValue(_property, (Comparable) entry.getValue());
											} catch (Exception e) {
											}
									}
									world.setBlock(_bp, _bs, 3);
								}
							}
						} else if (Math.random() <= 0.5 && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SNOW) {
							world.setBlock(BlockPos.containing(x, y, z), (new Object() {
								public BlockState with(BlockState _bs, String _property, int _newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
									return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
								}
							}.with(Blocks.SNOW.defaultBlockState(), "layers",
									(int) (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("layers") instanceof IntegerProperty _getip8
											? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip8)
											: -1) + 1))),
									3);
						}
					}
				}
			}
		}
	}
}
