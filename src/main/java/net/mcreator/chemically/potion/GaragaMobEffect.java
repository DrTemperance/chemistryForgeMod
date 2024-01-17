
package net.mcreator.chemically.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.chemically.procedures.AdweProcedure;

public class GaragaMobEffect extends MobEffect {
	public GaragaMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.chemically.coca_high";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		AdweProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
