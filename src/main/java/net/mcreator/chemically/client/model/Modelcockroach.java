package net.mcreator.chemically.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcockroach<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("chemically", "modelcockroach"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart bll;
	public final ModelPart brl;
	public final ModelPart mll;
	public final ModelPart mrl;
	public final ModelPart fll;
	public final ModelPart frl;

	public Modelcockroach(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.bll = root.getChild("bll");
		this.brl = root.getChild("brl");
		this.mll = root.getChild("mll");
		this.mrl = root.getChild("mrl");
		this.fll = root.getChild("fll");
		this.frl = root.getChild("frl");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(21, 25).addBox(-2.5F, -1.625F, -3.75F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(-2.0F, -0.875F, -1.75F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.425F, -1.25F));
		PartDefinition wing = body.addOrReplaceChild("wing", CubeListBuilder.create(), PartPose.offset(0.0F, -1.425F, -1.75F));
		PartDefinition rwing = wing.addOrReplaceChild("rwing",
				CubeListBuilder.create().texOffs(5, 0).addBox(-3.0F, -0.19F, 3.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(1, 0).addBox(-2.0F, -0.19F, 0.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-1.0F, -0.19F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(15, 6).addBox(-3.0F, -0.215F, 6.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.19F, 0.0F));
		PartDefinition cube_r1 = rwing.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(17, 8).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.285F, 10.0F, 0.0F, 1.5708F, -3.1416F));
		PartDefinition lwing = wing.addOrReplaceChild("lwing",
				CubeListBuilder.create().texOffs(1, 1).addBox(0.0F, -0.19F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(1, 0).addBox(1.0F, -0.19F, 0.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(5, 0)
						.addBox(2.0F, -0.19F, 3.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(15, 6).addBox(3.0F, -0.215F, 6.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.19F, 0.0F));
		PartDefinition cube_r2 = lwing.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(17, 8).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.285F, 10.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(19, 10).addBox(-0.5F, 0.375F, -1.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.425F, -5.0F));
		PartDefinition mouth2_r1 = head.addOrReplaceChild("mouth2_r1", CubeListBuilder.create().texOffs(19, 10).addBox(-0.5F, -0.0424F, -0.4932F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.3321F, -1.2977F, 0.1047F, 0.0F, 0.0F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 28).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6642F, -0.7026F, 0.1309F, 0.0F, 0.0F));
		PartDefinition antennaL = head.addOrReplaceChild("antennaL", CubeListBuilder.create(), PartPose.offset(1.0F, -1.325F, -2.0F));
		PartDefinition cube_r3 = antennaL.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 1).addBox(-2.3F, 0.0F, -4.0F, 4.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0636F, 0.0179F, -3.4587F, -0.0076F, -0.0869F, 0.0876F));
		PartDefinition antennaR = head.addOrReplaceChild("antennaR", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.325F, -2.0F));
		PartDefinition cube_r4 = antennaR.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 1).addBox(-2.4F, 0.0F, -4.0F, 4.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2937F, -0.0069F, -3.1766F, -0.0038F, -0.131F, 3.0986F));
		PartDefinition bll = partdefinition.addOrReplaceChild("bll", CubeListBuilder.create(), PartPose.offset(2.0F, 23.25F, 3.1278F));
		PartDefinition cube_r5 = bll.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(37, 10).addBox(-3.5F, 0.5F, -3.0F, 7.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8028F, -0.4623F, 3.3878F, 0.1212F, -0.4743F, 0.2393F));
		PartDefinition brl = partdefinition.addOrReplaceChild("brl", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8474F, 23.4283F, 6.1155F, -0.2244F, -0.1277F, 2.7779F));
		PartDefinition cube_r6 = brl.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 10).addBox(-2.75F, 0.65F, -1.975F, 7.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.459F, -0.5586F, -0.859F, 0.1914F, -0.3531F, 0.0433F));
		PartDefinition mll = partdefinition.addOrReplaceChild("mll", CubeListBuilder.create(), PartPose.offset(2.0F, 23.1F, -0.5F));
		PartDefinition cube_r7 = mll.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 17).addBox(-3.8F, 0.4F, -1.475F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 1.5F, -0.023F, -0.173F, 0.1329F));
		PartDefinition mrl = partdefinition.addOrReplaceChild("mrl", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5355F, 23.4574F, 1.4563F, 0.0F, 0.0131F, 2.8798F));
		PartDefinition cube_r8 = mrl.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(31, 17).addBox(-3.8F, 0.4F, -1.475F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4355F, -0.3574F, -0.4563F, -0.023F, -0.173F, 0.1329F));
		PartDefinition fll = partdefinition.addOrReplaceChild("fll", CubeListBuilder.create(), PartPose.offset(2.0F, 23.1F, -2.5F));
		PartDefinition cube_r9 = fll.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(39, 24).addBox(-3.0F, 0.0F, -1.5F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9443F, 0.3961F, 1.0F, 0.0F, 0.0175F, 0.1396F));
		PartDefinition frl = partdefinition.addOrReplaceChild("frl", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9557F, 23.4961F, -1.5F, 0.0F, 0.0F, 2.8798F));
		PartDefinition cube_r10 = frl.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(33, 24).addBox(-3.0F, 0.0F, -1.5F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0175F, 0.1396F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bll.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		brl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mll.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mrl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		fll.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		frl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
	}
}
