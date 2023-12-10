import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class DarkFountainModel extends EntityModel<Entity> {
	private final ModelPart beam;
	public DarkFountainModel(ModelPart root) {
		this.beam = root.getChild("beam");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData beam = modelPartData.addChild("beam", ModelPartBuilder.create().uv(0, 0).cuboid(-10.0F, -5120.0F, -10.0F, 20.0F, 5120.0F, 20.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 80, 5140);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		beam.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}