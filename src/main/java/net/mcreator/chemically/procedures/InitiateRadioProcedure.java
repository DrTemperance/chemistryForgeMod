package net.mcreator.chemically.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.chemically.init.ChemicallyModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InitiateRadioProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(ChemicallyModGameRules.RADIOACTIVE_DAMAGE)) {
			CompoundTag dataIndex1 = new CompoundTag();
			entity.saveWithoutId(dataIndex1);
			dataIndex1.putDouble("Rads", 0);
			entity.load(dataIndex1);
		}
	}
}
