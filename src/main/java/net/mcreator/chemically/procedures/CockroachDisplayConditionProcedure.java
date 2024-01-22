package net.mcreator.chemically.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CockroachDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getBoolean("hatted");
	}
}
