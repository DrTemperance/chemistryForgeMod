package net.mcreator.chemically.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CockroachEntityIsHurtProcedure {
	public static boolean execute(DamageSource damagesource) {
		if (damagesource == null)
			return false;
		if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("chemically:radiation")))) {
			return false;
		}
		return true;
	}
}
