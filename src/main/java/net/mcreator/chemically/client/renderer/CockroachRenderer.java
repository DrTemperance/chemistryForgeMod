
package net.mcreator.chemically.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.chemically.entity.CockroachEntity;
import net.mcreator.chemically.client.model.Modelcockroach;

public class CockroachRenderer extends MobRenderer<CockroachEntity, Modelcockroach<CockroachEntity>> {
	public CockroachRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcockroach(context.bakeLayer(Modelcockroach.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(CockroachEntity entity) {
		return new ResourceLocation("chemically:textures/entities/cockroach.png");
	}
}
