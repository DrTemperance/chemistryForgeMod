package net.mcreator.chemically.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class SinusoidalWaveUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double iteration = 0;
		iteration = 0;
		while (iteration <= 12) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, (x + Math.sin(iteration)), (y + iteration), (z - Math.cos(iteration)), 8, 0, 0, 0, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, (x - Math.sin(iteration)), (y + iteration), (z + Math.cos(iteration)), 8, 0, 0, 0, 0);
			iteration = iteration + 0.125;
		}
	}
}
