
package net.mcreator.chemically.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RadiationSicknessMobEffect extends MobEffect {
	public RadiationSicknessMobEffect() {
		super(MobEffectCategory.HARMFUL, -13956282);
	}

	@Override
	public String getDescriptionId() {
		return "effect.chemically.radiation_sickness";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
