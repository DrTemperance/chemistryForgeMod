package net.mcreator.chemically.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

public class ConveyerEntityWalksOnTheBlockFixedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double RedstoneTotal = 0;
		RedstoneTotal = 0;
		if (!entity.isShiftKeyDown()) {
			for (Direction directioniterator : Direction.values()) {
				RedstoneTotal = RedstoneTotal + (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(BlockPos.containing(x, y, z), directioniterator) : 0);
			}
			if (1 <= RedstoneTotal) {
				if (60 <= RedstoneTotal) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("chemically:max_conveyer"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, x, (y + 0.25), z, 3, 0.02, 0.025, 0.02, 0.05);
			}
		}
	}
}
