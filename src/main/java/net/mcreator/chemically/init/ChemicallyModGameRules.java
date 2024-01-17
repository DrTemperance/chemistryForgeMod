
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemically.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChemicallyModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> RADIOACTIVE_DAMAGE = GameRules.register("radioactiveDamage", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
}
