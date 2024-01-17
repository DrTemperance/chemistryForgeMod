
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemically.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.chemically.ChemicallyMod;

public class ChemicallyModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ChemicallyMod.MODID);
	public static final RegistryObject<Potion> COCA = REGISTRY.register("coca", () -> new Potion(new MobEffectInstance(ChemicallyModMobEffects.COCA_HIGH.get(), 3600, 0, false, true)));
}
