
package net.mcreator.chemically.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.chemically.procedures.EndSicknessOnEffectActiveTickProcedure;
import net.mcreator.chemically.procedures.EndSicknessActiveTickConditionProcedure;

public class EndSicknessMobEffect extends MobEffect {
	public EndSicknessMobEffect() {
		super(MobEffectCategory.HARMFUL, -12245155);
	}

	@Override
	public String getDescriptionId() {
		return "effect.chemically.end_sickness";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EndSicknessOnEffectActiveTickProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return EndSicknessActiveTickConditionProcedure.execute(amplifier, duration);
	}
}
