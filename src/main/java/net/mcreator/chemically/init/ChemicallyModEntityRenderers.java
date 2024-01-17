
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemically.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.chemically.client.renderer.GammaRayRenderer;
import net.mcreator.chemically.client.renderer.CockroachRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ChemicallyModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ChemicallyModEntities.COCKROACH.get(), CockroachRenderer::new);
		event.registerEntityRenderer(ChemicallyModEntities.GAMMA_RAY.get(), GammaRayRenderer::new);
		event.registerEntityRenderer(ChemicallyModEntities.CRYO_SHOT.get(), ThrownItemRenderer::new);
	}
}
