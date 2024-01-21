package net.mcreator.chemically.procedures;

import net.minecraft.world.entity.Entity;

public class CockroachOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("hatted", false);
	}
}
