package net.mcreator.chemically.procedures;

import net.minecraft.world.entity.Entity;

public class CryoShotProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setTicksFrozen((int) (entity.getTicksFrozen() + 20));
	}
}
