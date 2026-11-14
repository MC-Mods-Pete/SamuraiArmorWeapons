package net.petemc.knightarmorweapons.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;

public class Modelsamurai_armor<T extends Entity> extends EntityModel<T> {
        public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("ryans_vsk", "modelsamurai_armor"), "main");
        public final ModelPart chestplate;
        public final ModelPart leggins;
        public final ModelPart right_leg;
        public final ModelPart left_leg;
        public final ModelPart helmet;
        public final ModelPart right_arm;
        public final ModelPart left_arm;
        public final ModelPart leggins2;

        public Modelsamurai_armor(ModelPart root) {
            this.chestplate = root.getChild("chestplate");
            this.leggins = root.getChild("leggins");
            this.right_leg = root.getChild("right_leg");
            this.left_leg = root.getChild("left_leg");
            this.helmet = root.getChild("helmet");
            this.right_arm = root.getChild("right_arm");
            this.left_arm = root.getChild("left_arm");
            this.leggins2 = root.getChild("leggins2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshdefinition = new MeshDefinition();
            PartDefinition partdefinition = meshdefinition.getRoot();
            PartDefinition chestplate = partdefinition.addOrReplaceChild("chestplate", CubeListBuilder.create().texOffs(0, 47).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(26, 47).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 12.0F, 5.0F, new CubeDeformation(0.4F)).texOffs(52, 53).addBox(-1.5F, 9.0F, -4.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
            chestplate.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(52, 58).addBox(-4.0F, -1.0F, -0.4F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0F, -3.0F, -0.1309F, 0.0F, 0.0F));
            chestplate.addOrReplaceChild("armor_back", CubeListBuilder.create().texOffs(62, 30).addBox(-4.0F, -3.0F, -1.6F, 8.0F, 11.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.0F, 3.0F, 0.1745F, 0.0F, 0.0F));
            chestplate.addOrReplaceChild("sword_one", CubeListBuilder.create().texOffs(53, 13).addBox(0.0F, -1.0F, -1.0F, 1.0F, 15.0F, 2.0F, new CubeDeformation(0.2F)).texOffs(52, 36).addBox(0.0F, -8.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(47, 44).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 10.0F, -2.6F, 1.0405F, 0.151F, -0.0879F));
            chestplate.addOrReplaceChild("sword_two", CubeListBuilder.create().texOffs(47, 14).addBox(0.0F, -1.0F, -1.0F, 1.0F, 15.0F, 2.0F, new CubeDeformation(0.2F)).texOffs(46, 36).addBox(0.0F, -8.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(43, 31).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 10.9F, -2.3F, 0.6528F, 0.05F, -0.0715F));
            PartDefinition leggins = partdefinition.addOrReplaceChild("leggins", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 0.0F));
            PartDefinition leg_armor = leggins.addOrReplaceChild("leg_armor", CubeListBuilder.create().texOffs(20, 35).mirror(true).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
            leg_armor.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 36).mirror(true).addBox(-1.0F, -1.0F, -3.0F, 4.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
            PartDefinition leg_armor3 = leggins.addOrReplaceChild("leg_armor3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
            PartDefinition leg_armor2 = leggins.addOrReplaceChild("leg_armor2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));
            leg_armor2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 28).mirror(true).addBox(-3.5F, 2.0F, -1.5F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
            leg_armor2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 20).mirror(true).addBox(-4.0F, -1.0F, -1.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
            PartDefinition leg_armor4 = leggins.addOrReplaceChild("leg_armor4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0F));
            leg_armor4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 11).mirror(true).addBox(-3.5F, -1.0F, -1.2F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
            partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(31, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
            partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(31, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.21F)), PartPose.offset(2.0F, 12.0F, 0.0F));
            PartDefinition helmet = partdefinition.addOrReplaceChild("helmet", CubeListBuilder.create().texOffs(52, 0).addBox(-4.5F, -10.0F, -4.5F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -7.0F, -6.5F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 0).addBox(-5.0F, -6.9F, -4.9F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(84, 13).addBox(-5.5F, -3.9F, -4.9F, 11.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
            PartDefinition mask = helmet.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(96, 30).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(84, 37).addBox(-2.0F, -1.0F, -4.7F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(86, 28).addBox(-4.0F, -7.0F, -4.2F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 0.0F, 0.0F));
            mask.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(98, 31).addBox(-1.0F, -7.8F, -5.1F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, -0.0436F, 0.0F, 0.0F));
            mask.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(84, 41).addBox(-2.5F, -1.8F, -0.4F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -3.7F, 0.2182F, 0.0F, 0.0F));
            PartDefinition tusk = mask.addOrReplaceChild("tusk", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -4.0F));
            PartDefinition nose = mask.addOrReplaceChild("nose", CubeListBuilder.create(), PartPose.offset(0.0F, -4.2F, -3.9F));
            nose.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(88, 32).addBox(-1.0F, -1.0F, -0.4F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.2793F, 0.7854F));
            PartDefinition crown = helmet.addOrReplaceChild("crown", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, -5.0F));
            crown.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(104, 52).addBox(-2.7F, -8.3F, 0.0F, 11.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(118, 46).addBox(-0.7F, -3.3F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
            PartDefinition helmet_thing2 = helmet.addOrReplaceChild("helmet_thing2", CubeListBuilder.create(), PartPose.offset(-5.0F, -6.0F, -5.0F));
            helmet_thing2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(82, 0).mirror(true).addBox(-2.0F, -0.8F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3054F));
            PartDefinition helmet_thing = helmet.addOrReplaceChild("helmet_thing", CubeListBuilder.create(), PartPose.offset(5.0F, -6.0F, -5.0F));
            helmet_thing.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(82, 0).addBox(-1.0F, -0.8F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
            PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(88, 48).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 48).mirror(true).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(-4.0F, 2.0F, 0.0F));
            right_arm.addOrReplaceChild("shoulder2", CubeListBuilder.create().texOffs(66, 13).mirror(true).addBox(-4.5F, -1.5F, -2.5F, 4.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
            PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(88, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(4.0F, 2.0F, 0.0F));
            left_arm.addOrReplaceChild("shoulder", CubeListBuilder.create().texOffs(66, 13).addBox(0.5F, -1.5F, -2.5F, 4.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
            PartDefinition leggins2 = partdefinition.addOrReplaceChild("leggins2", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 0.0F));
            PartDefinition leg_armor5 = leggins2.addOrReplaceChild("leg_armor5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
            PartDefinition leg_armor6 = leggins2.addOrReplaceChild("leg_armor6", CubeListBuilder.create().texOffs(20, 35).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
            leg_armor6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 36).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
            PartDefinition leg_armor7 = leggins2.addOrReplaceChild("leg_armor7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));
            leg_armor7.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 2.0F, -1.5F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
            leg_armor7.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -1.0F, -1.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
            PartDefinition leg_armor8 = leggins2.addOrReplaceChild("leg_armor8", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0F));
            leg_armor8.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -1.0F, -1.2F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
            return LayerDefinition.create(meshdefinition, 128, 64);
        }

    @Override
    public void setupAnim(T t, float v, float v1, float v2, float v3, float v4) {
    }

    @Override
    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            this.chestplate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
            this.leggins.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
            this.right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
            this.left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
            this.helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
            this.right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
            this.left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
            this.leggins2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        }
    }
