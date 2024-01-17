
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemically.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.chemically.client.model.Modelgamma;
import net.mcreator.chemically.client.model.Modelcockroach;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ChemicallyModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcockroach.LAYER_LOCATION, Modelcockroach::createBodyLayer);
		event.registerLayerDefinition(Modelgamma.LAYER_LOCATION, Modelgamma::createBodyLayer);
	}
}
