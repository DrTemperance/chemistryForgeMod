
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemically.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.chemically.ChemicallyMod;

public class ChemicallyModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ChemicallyMod.MODID);
	public static final RegistryObject<SoundEvent> LPMDS_ACTIVATION_SUCCESS = REGISTRY.register("lpmds-activation-success", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "lpmds-activation-success")));
	public static final RegistryObject<SoundEvent> GAMMAGUN_FIRE = REGISTRY.register("gammagun.fire", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "gammagun.fire")));
	public static final RegistryObject<SoundEvent> GAMMAGUN_CHARGE = REGISTRY.register("gammagun.charge", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "gammagun.charge")));
	public static final RegistryObject<SoundEvent> ENTITY_COCKROACH_HURT = REGISTRY.register("entity.cockroach_hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "entity.cockroach_hurt")));
	public static final RegistryObject<SoundEvent> ITEM_GRAVITYGUN_LAUNCH = REGISTRY.register("item.gravitygun.launch", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "item.gravitygun.launch")));
	public static final RegistryObject<SoundEvent> ITEM_GRAVITYGUN_HOLDLOOP = REGISTRY.register("item.gravitygun.holdloop", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "item.gravitygun.holdloop")));
	public static final RegistryObject<SoundEvent> ITEM_GRAVITYGUN_ERROR = REGISTRY.register("item.gravitygun.error", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "item.gravitygun.error")));
	public static final RegistryObject<SoundEvent> ITEM_GRAVITYGUN_PICKUP = REGISTRY.register("item.gravitygun.pickup", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "item.gravitygun.pickup")));
	public static final RegistryObject<SoundEvent> ITEM_GRAVITYGUN_DROP = REGISTRY.register("item.gravitygun.drop", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "item.gravitygun.drop")));
	public static final RegistryObject<SoundEvent> VOCAL_DECONTAMINATION = REGISTRY.register("vocal.decontamination", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "vocal.decontamination")));
	public static final RegistryObject<SoundEvent> VOCAL_UNAUTHORIZEDACTIVITY = REGISTRY.register("vocal.unauthorizedactivity", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "vocal.unauthorizedactivity")));
	public static final RegistryObject<SoundEvent> NUKE_WARN = REGISTRY.register("nuke.warn", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "nuke.warn")));
	public static final RegistryObject<SoundEvent> VOCAL_ALERT = REGISTRY.register("vocal.alert", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "vocal.alert")));
	public static final RegistryObject<SoundEvent> VOCAL_WARNING = REGISTRY.register("vocal.warning", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "vocal.warning")));
	public static final RegistryObject<SoundEvent> VOCAL_EVACUATION = REGISTRY.register("vocal.evacuation", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "vocal.evacuation")));
	public static final RegistryObject<SoundEvent> VOCAL_REACTORBREACH = REGISTRY.register("vocal.reactorbreach", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chemically", "vocal.reactorbreach")));
}
