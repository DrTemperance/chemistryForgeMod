package net.mcreator.chemically.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CockroachEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("hatted")) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ChemicallyModItems.DELETED_MOD_ELEMENT.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
