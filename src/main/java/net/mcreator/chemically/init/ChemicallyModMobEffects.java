
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemically.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.chemically.potion.RadiationSicknessMobEffect;
import net.mcreator.chemically.potion.GaragaMobEffect;
import net.mcreator.chemically.potion.EndSicknessMobEffect;
import net.mcreator.chemically.ChemicallyMod;

public class ChemicallyModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ChemicallyMod.MODID);
	public static final RegistryObject<MobEffect> COCA_HIGH = REGISTRY.register("coca_high", () -> new GaragaMobEffect());
	public static final RegistryObject<MobEffect> END_SICKNESS = REGISTRY.register("end_sickness", () -> new EndSicknessMobEffect());
	public static final RegistryObject<MobEffect> RADIATION_SICKNESS = REGISTRY.register("radiation_sickness", () -> new RadiationSicknessMobEffect());
}
