// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.entity.Entity;

public class DarkFountainModel<T extends Entity> extends EntityModel<T> {
	private final ModelPart beam;

	public DarkFountainModel(ModelPart root) {
		this.beam = root.getChild("beam");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition beam = partdefinition.addOrReplaceChild("beam", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -5120.0F, -10.0F, 20.0F, 5120.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 5140);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		beam.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}