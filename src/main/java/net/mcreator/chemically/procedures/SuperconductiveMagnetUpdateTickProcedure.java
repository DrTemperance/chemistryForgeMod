package net.mcreator.chemically.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;

import net.mcreator.chemically.init.ChemicallyModEntities;
import net.mcreator.chemically.entity.GammaRayEntity;

public class SuperconductiveMagnetUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (Direction directioniterator : Direction.Plane.HORIZONTAL) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new GammaRayEntity(ChemicallyModEntities.GAMMA_RAY.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos(x, (y + 1), z);
				_entityToSpawn.shoot((directioniterator.getStepX()), (directioniterator.getStepY()), (directioniterator.getStepZ()), 1, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}
}
