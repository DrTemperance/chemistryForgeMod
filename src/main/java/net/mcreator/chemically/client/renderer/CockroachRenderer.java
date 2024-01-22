
package net.mcreator.chemically.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.chemically.procedures.CockroachDisplayConditionProcedure;
import net.mcreator.chemically.entity.CockroachEntity;
import net.mcreator.chemically.client.model.Modelgamma;
import net.mcreator.chemically.client.model.Modelcockroach;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CockroachRenderer extends MobRenderer<CockroachEntity, Modelcockroach<CockroachEntity>> {
	public CockroachRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcockroach(context.bakeLayer(Modelcockroach.LAYER_LOCATION)), 0.3f);
		this.addLayer(new RenderLayer<CockroachEntity, Modelcockroach<CockroachEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("chemically:textures/entities/cockroach.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CockroachEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (CockroachDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelgamma(Minecraft.getInstance().getEntityModels().bakeLayer(Modelgamma.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CockroachEntity entity) {
		return new ResourceLocation("chemically:textures/entities/cockroach.png");
	}
}
