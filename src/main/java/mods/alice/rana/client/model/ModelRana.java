package mods.alice.rana.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRana extends ModelBiped
{
	static final float offsetY = 4F;
	/*
	 * This offset is used for 45° rotated box.
	 *   4 * (1 / sqrt(2))
	 * = 4 * (1 / 1.41421356237)
	 * = 4 * 0.707106781188
	 * = 2.82842712475
	 */
	static final float offsetY45 = 2.82842712475F;
	public ModelRenderer headwearRightEye;
	public ModelRenderer headwearLeftEye;
	public ModelRenderer tailRight1;
	public ModelRenderer tailLeft1;
	public ModelRenderer tailRight2;
	public ModelRenderer tailLeft2;
	public ModelRenderer tailRight3;
	public ModelRenderer tailLeft3;
	public ModelRenderer sideHairRight;
	public ModelRenderer sideHairLeft;
	public ModelRenderer frontHairRight;
	public ModelRenderer frontHair;
	public ModelRenderer frontHairLeft;
	public ModelRenderer headwearRightEye2;
	public ModelRenderer headwearLeftEye2;
	public ModelRenderer backPack;
	public ModelRenderer frontClothBorder;
	public ModelRenderer clothPocket;
	public ModelRenderer armBallRight;
	public ModelRenderer armBallLeft;
	public ModelRenderer footRight;
	public ModelRenderer footLeft;

	public ModelRana()
	{
		this.heldItemLeft = 0;
		this.heldItemRight = 0;
		this.isSneak = false;

		this.bipedCloak = new ModelRenderer(this, 0, 0);
		this.bipedCloak.addBox(-5F, offsetY, -1F, 10, 16, 1, 0);

		this.bipedEars = new ModelRenderer(this, 24, 0);
		this.bipedEars.addBox(-3F, offsetY - 6F, -1F, 6, 6, 1, 0);

		this.bipedHead = new ModelRenderer(this, 0, 0);
		this.bipedHead.addBox(-4F, offsetY - 8F, -4F, 8, 8, 8, 0);
		this.bipedHead.setRotationPoint(0, 0, 0);

		this.bipedHeadwear = new ModelRenderer(this, 32, 0);
		this.bipedHeadwear.addBox(-4F, offsetY - 7.75F, -4F, 8, 3, 8, 0.75F);
		this.bipedHeadwear.setRotationPoint(0, 0, 0);

		this.headwearRightEye = new ModelRenderer(this, 24, 2);
		this.headwearRightEye.addBox(-5, offsetY - 11, -3, 4, 3, 3, -0.125F);
		this.headwearRightEye.setRotationPoint(0, 0, 0);

		this.headwearLeftEye = new ModelRenderer(this, 24, 2);
		this.headwearLeftEye.addBox(1, offsetY - 11, -3, 4, 3, 3, -0.125F);
		this.headwearLeftEye.setRotationPoint(0, 0, 0);

		this.headwearRightEye2 = new ModelRenderer(this, 48, 13);
		this.headwearRightEye2.addBox(-4, offsetY - 10, -3.5F, 2, 2, 2, -0.375F);
		this.headwearRightEye2.setRotationPoint(0, 0, 0);

		this.headwearLeftEye2 = new ModelRenderer(this, 48, 13);
		this.headwearLeftEye2.addBox(2, offsetY - 10, -3.5F, 2, 2, 2, -0.375F);
		this.headwearLeftEye2.setRotationPoint(0, 0, 0);

		this.tailRight1 = new ModelRenderer(this, 9, 16);
		this.tailRight1.addBox(-4, offsetY - 3, 4, 3, 3, 1, -0.25F);
		this.tailRight1.setRotationPoint(0, 0, 0);

		this.tailLeft1 = new ModelRenderer(this, 9, 16);
		this.tailLeft1.addBox(1, offsetY - 3, 4, 3, 3, 1, -0.25F);
		this.tailLeft1.setRotationPoint(0, 0, 0);

		this.tailRight2 = new ModelRenderer(this, 29, 16);
		this.tailRight2.addBox(-3.5F, offsetY - 2.5F, 4, 2, 2, 2, 0);
		this.tailRight2.setRotationPoint(0, 0, 0);

		this.tailLeft2 = new ModelRenderer(this, 29, 16);
		this.tailLeft2.addBox(1.5F, offsetY - 2.5F, 4, 2, 2, 2, 0);
		this.tailLeft2.setRotationPoint(0, 0, 0);

		this.tailRight3 = new ModelRenderer(this, 0, 0);
		this.tailRight3.addBox(-5.5F, offsetY - 1.5F, 5, 3, 3, 3, 0);
		this.tailRight3.setRotationPoint(0, 0, 0);

		this.tailLeft3 = new ModelRenderer(this, 0, 0);
		this.tailLeft3.addBox(2.5F, offsetY - 1.5F, 5, 3, 3, 3, 0);
		this.tailLeft3.setRotationPoint(0, 0, 0);

		this.sideHairRight = new ModelRenderer(this, 43, 13);
		this.sideHairRight.addBox(-4, offsetY - 4.625F, -3, 1, 4, 1, 0.5F);
		this.sideHairRight.setRotationPoint(0, 0, 0);

		this.sideHairLeft = new ModelRenderer(this, 43, 13);
		this.sideHairLeft.addBox(3, offsetY - 4.625F, -3, 1, 4, 1, 0.5F);
		this.sideHairLeft.setRotationPoint(0, 0, 0);

		this.frontHairRight = new ModelRenderer(this, 29, 16);
		this.frontHairRight.addBox(-2, offsetY - 4.5F, -4.625F, 2, 2, 2, -0.5F);
		this.frontHairRight.setRotationPoint(0, 0, 0);

		this.frontHair = new ModelRenderer(this, 29, 16);
		this.frontHair.addBox(-1, offsetY - 4.5F, -4.5F, 2, 2, 2, -0.375F);
		this.frontHair.setRotationPoint(0, 0, 0);

		this.frontHairLeft = new ModelRenderer(this, 29, 16);
		this.frontHairLeft.addBox(0, offsetY - 4.5F, -4.625F, 2, 2, 2, -0.5F);
		this.frontHairLeft.setRotationPoint(0, 0, 0);

		this.bipedBody = new ModelRenderer(this, 14, 17);
		this.bipedBody.addBox(-4, offsetY + 0.5F, -2, 6, 10, 3, 0.5F);
		this.bipedBody.setRotationPoint(1, 0, 0);

		this.backPack = new ModelRenderer(this, 46, 17);
		this.backPack.addBox(-3, offsetY + 1, 1, 4, 5, 2, 0.5F);
		this.backPack.setRotationPoint(1, 0, 0);

		this.frontClothBorder = new ModelRenderer(this, 58, 17);
		this.frontClothBorder.addBox(-1.5F, offsetY, -2.625F, 1, 10, 1, 0);
		this.frontClothBorder.setRotationPoint(1, 0, 0);

		this.clothPocket = new ModelRenderer(this, 3, 18);
		this.clothPocket.addBox(0.5F, offsetY + 3.25F, -2.25F, 1, 1, 1, 0.625F);
		this.clothPocket.setRotationPoint(1, 0, 0);

		this.bipedRightArm = new ModelRenderer(this, 34, 17);
		this.bipedRightArm.addBox(-3 + offsetY45, offsetY - 2, -2, 3, 10, 3, 0);
		this.bipedRightArm.setRotationPoint(-5, 3, 0);

		this.bipedLeftArm = new ModelRenderer(this, 34, 17);
		this.bipedLeftArm.mirror = true;
		this.bipedLeftArm.addBox(-1 - offsetY45, offsetY - 2, -2, 3, 10, 3, 0);
		this.bipedLeftArm.setRotationPoint(5, 3, 0);

		this.armBallRight = new ModelRenderer(this, 46, 25);
		this.armBallRight.addBox(-3 + offsetY45, offsetY + 4, -2, 3, 2, 3, 0.25F);
		this.armBallRight.setRotationPoint(-5, 3, 0);

		this.armBallLeft = new ModelRenderer(this, 46, 25);
		this.armBallLeft.mirror = true;
		this.armBallLeft.addBox(-1 - offsetY45, offsetY + 4, -2, 3, 2, 3, 0.25F);
		this.armBallLeft.setRotationPoint(5, 3, 0);

		this.bipedRightLeg = new ModelRenderer(this, 0, 17);
		this.bipedRightLeg.addBox(-2, offsetY - 2, -2, 3, 10, 3, 0);
		this.bipedRightLeg.setRotationPoint(-1, 12, 0);

		this.bipedLeftLeg = new ModelRenderer(this, 0, 17);
		this.bipedLeftLeg.mirror = true;
		this.bipedLeftLeg.addBox(-2, offsetY - 2, -2, 3, 10, 3, 0);
		this.bipedLeftLeg.setRotationPoint(2, 12, 0);

		this.footRight = new ModelRenderer(this, 32, 13);
		this.footRight.addBox(-2, offsetY + 6, -3, 3, 2, 1, 0);
		this.footRight.setRotationPoint(-1, 12, 0);

		this.footLeft = new ModelRenderer(this, 32, 13);
		this.footLeft.mirror = true;
		this.footLeft.addBox(-2, offsetY + 6, -3, 3, 2, 1, 0);
		this.footLeft.setRotationPoint(2, 12, 0);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.bipedHead.render(f5);
		this.bipedBody.render(f5);
		this.bipedRightArm.render(f5);
		this.bipedLeftArm.render(f5);
		this.bipedRightLeg.render(f5);
		this.bipedLeftLeg.render(f5);
		this.bipedHeadwear.render(f5);
		this.headwearRightEye.render(f5); // Headwear Right Eye
		this.headwearLeftEye.render(f5); // Headwear Left Eye
		this.tailRight1.render(f5); // Right tail 1
		this.tailLeft1.render(f5); // Left tail 1
		this.tailRight2.render(f5); // Right tail 2
		this.tailLeft2.render(f5); // Left tail 2
		this.tailRight3.render(f5); // Right tail 3
		this.tailLeft3.render(f5); // Left tail 3
		this.sideHairRight.render(f5); // Right side
		this.sideHairLeft.render(f5); // Left side
		this.frontHairRight.render(f5); // Front hair right
		this.frontHair.render(f5); // Front hair
		this.frontHairLeft.render(f5); // Front hair left
		this.headwearRightEye2.render(f5); // Headwear Right Eyeball
		this.headwearLeftEye2.render(f5); // Headwear Left Eyeball
		this.backPack.render(f5); // Bag
		this.frontClothBorder.render(f5); // Front cloth border
		this.clothPocket.render(f5); // Cloth Pocket
		this.armBallRight.render(f5); // Right arm ball
		this.armBallLeft.render(f5); // Left arm ball
		this.footRight.render(f5); // Right Foot
		this.footLeft.render(f5); // Left foot
	}

	private static void copyRotateAngle(ModelRenderer dst, ModelRenderer src)
	{
		dst.rotateAngleX = src.rotateAngleX;
		dst.rotateAngleY = src.rotateAngleY;
	}

	private static void copyRotateAngleXYZ(ModelRenderer dst, ModelRenderer src)
	{
		dst.rotateAngleX = src.rotateAngleX;
		dst.rotateAngleY = src.rotateAngleY;
		dst.rotateAngleZ = src.rotateAngleZ;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par7Entity)
	{
		this.bipedHead.rotateAngleY = f3 / 57.3F;
		this.bipedHead.rotateAngleX = f4 / 57.3F;

		ModelRana.copyRotateAngle(this.bipedHeadwear, this.bipedHead);
		ModelRana.copyRotateAngle(this.headwearRightEye, this.bipedHead);
		ModelRana.copyRotateAngle(this.headwearLeftEye, this.bipedHead);
		ModelRana.copyRotateAngle(this.tailRight1, this.bipedHead);
		ModelRana.copyRotateAngle(this.tailLeft1, this.bipedHead);
		ModelRana.copyRotateAngle(this.tailRight2, this.bipedHead);
		ModelRana.copyRotateAngle(this.tailLeft2, this.bipedHead);
		ModelRana.copyRotateAngle(this.tailRight3, this.bipedHead);
		ModelRana.copyRotateAngle(this.tailLeft3, this.bipedHead);
		ModelRana.copyRotateAngle(this.sideHairRight, this.bipedHead);
		ModelRana.copyRotateAngle(this.sideHairLeft, this.bipedHead);
		ModelRana.copyRotateAngle(this.frontHairRight, this.bipedHead);
		ModelRana.copyRotateAngle(this.frontHair, this.bipedHead);
		ModelRana.copyRotateAngle(this.frontHairLeft, this.bipedHead);
		ModelRana.copyRotateAngle(this.headwearRightEye2, this.bipedHead);
		ModelRana.copyRotateAngle(this.headwearLeftEye2, this.bipedHead);

		this.bipedRightArm.rotateAngleX = (float)Math.cos(f * 0.6 + Math.PI) * 2 * f1 * 0.5F;
		this.bipedLeftArm.rotateAngleX = (float)Math.cos(f * 0.6) * 2 * f1 * 0.5F;
		this.bipedRightArm.rotateAngleZ = 0;
		this.bipedLeftArm.rotateAngleZ = 0;

		this.bipedRightLeg.rotateAngleX = (float)Math.cos(f * 0.6) * 1.4F * f1;
		this.bipedRightLeg.rotateAngleY = 0;
		ModelRana.copyRotateAngle(this.footRight, this.bipedRightLeg);

		this.bipedLeftLeg.rotateAngleX = (float)Math.cos(f * 0.6 + Math.PI) * 1.4F * f1;
		this.bipedLeftLeg.rotateAngleY = 0;
		ModelRana.copyRotateAngle(this.footLeft, this.bipedLeftLeg);

		float v = (float)(Math.PI / 10);
		float vh = (float)-(Math.PI / 5);

		if(this.isRiding)
		{
			this.bipedRightArm.rotateAngleX += vh;
			this.bipedLeftArm.rotateAngleX += vh;

			this.footRight.rotateAngleX = this.bipedRightLeg.rotateAngleX = -1.25F;
			this.footLeft.rotateAngleX = this.bipedLeftLeg.rotateAngleX = -1.25F;

			this.footRight.rotateAngleY = this.bipedRightLeg.rotateAngleY = v;
			this.footLeft.rotateAngleY = this.bipedLeftLeg.rotateAngleY = -v;
		}
		if(this.heldItemLeft != 0)
		{
			this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - v;
		}
		if(this.heldItemRight != 0)
		{
			this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - v;
		}

		this.bipedRightArm.rotateAngleY = 0;
		this.bipedLeftArm.rotateAngleY = 0;

		if(this.onGround > -9990F)
		{
			float f6 = onGround;

			this.bipedBody.rotateAngleY = (float)Math.sin(Math.sqrt(f6) * Math.PI * 2) * 0.2F;
			this.backPack.rotateAngleY = this.bipedBody.rotateAngleY;
			this.frontClothBorder.rotateAngleY =  this.bipedBody.rotateAngleY;
			this.clothPocket.rotateAngleY =  this.bipedBody.rotateAngleY;

			this.bipedRightArm.rotationPointZ = (float)Math.sin(this.bipedBody.rotateAngleY) * 5F;
			this.armBallRight.rotationPointZ = (float)Math.sin(this.bipedBody.rotateAngleY) * 5F;
			this.bipedRightArm.rotationPointX = (float)-Math.cos(this.bipedBody.rotateAngleY) * 5F + 2F;
			this.armBallRight.rotationPointX = (float)-Math.cos(this.bipedBody.rotateAngleY) * 5F + 2F;
			this.bipedLeftArm.rotationPointZ = (float)-Math.sin(this.bipedBody.rotateAngleY) * 5F;
			this.armBallLeft.rotationPointZ = (float)-Math.sin(this.bipedBody.rotateAngleY) * 5F;
			this.bipedLeftArm.rotationPointX = (float)Math.cos(this.bipedBody.rotateAngleY) * 5F - 1F;
			this.armBallLeft.rotationPointX = (float)Math.cos(this.bipedBody.rotateAngleY) * 5F - 1F;
			this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY;
			this.bipedLeftArm.rotateAngleY += this.bipedBody.rotateAngleY;
			this.bipedLeftArm.rotateAngleX += this.bipedBody.rotateAngleY;
			f6 = 1 - onGround;
			f6 *= f6;
			f6 *= f6;
			f6 = 1 - f6;
			float f7 = (float)Math.sin(f6 * Math.PI);
			float f8 = (float)Math.sin(this.onGround * Math.PI) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
			this.bipedRightArm.rotateAngleX -= (double)f7 * 1.2 + (double)f8;
			this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY * 2F;
			this.bipedRightArm.rotateAngleZ = (float)Math.sin(this.onGround * Math.PI) * -0.4F;
		}
		if(this.isSneak)
		{
			this.bipedBody.rotateAngleX = 0.5F;
			this.backPack.rotateAngleX = 0.5F;
			this.frontClothBorder.rotateAngleX = 0.5F;
			this.clothPocket.rotateAngleX = 0.5F;

			//bipedRightLeg.rotateAngleX -= 0.0F;
			//bipedLeftLeg.rotateAngleX -= 0.0F;

			this.bipedRightArm.rotateAngleX += 0.4F;
			this.bipedLeftArm.rotateAngleX += 0.4F;

			this.bipedRightLeg.rotationPointZ = 4F;
			this.footRight.rotationPointZ = 4F;
			this.bipedLeftLeg.rotationPointZ = 4F;
			this.footLeft.rotationPointZ = 4F;
			this.bipedRightLeg.rotationPointY = 9F;
			this.footRight.rotationPointY = 9F;
			this.bipedLeftLeg.rotationPointY = 9F;
			this.footLeft.rotationPointY = 9F;

			this.bipedHead.rotationPointY = 1F;
		}
		else
		{
			this.bipedBody.rotateAngleX = 0;
			this.backPack.rotateAngleX = 0;
			this.frontClothBorder.rotateAngleX = 0;
			this.clothPocket.rotateAngleX = 0;

			this.bipedRightLeg.rotationPointZ = 0;
			this.footRight.rotationPointZ = 0;
			this.bipedLeftLeg.rotationPointZ = 0;
			this.footLeft.rotationPointZ = 0;
			this.bipedRightLeg.rotationPointY = 12F;
			this.footRight.rotationPointY = 12F;
			this.bipedLeftLeg.rotationPointY = 12F;
			this.footLeft.rotationPointY = 12F;

			this.bipedHead.rotationPointY = 0F;
		}
		this.bipedRightArm.rotateAngleZ += 0.5F;
		this.bipedLeftArm.rotateAngleZ -= 0.5F;
		this.bipedRightArm.rotateAngleZ += (float)Math.cos(f2 * 0.09F) * 0.05F + 0.05F;
		this.bipedLeftArm.rotateAngleZ -= (float)Math.cos(f2 * 0.09F) * 0.05F + 0.05F;
		this.bipedRightArm.rotateAngleX += (float)Math.sin(f2 * 0.067F) * 0.05F;
		this.bipedLeftArm.rotateAngleX -= (float)Math.sin(f2 * 0.067F) * 0.05F;

		ModelRana.copyRotateAngleXYZ(this.armBallRight, this.bipedRightArm);
		ModelRana.copyRotateAngleXYZ(this.armBallLeft, this.bipedLeftArm);
	}

	@Override
	public void renderEars(float f)
	{
		this.bipedEars.rotateAngleY = this.bipedHead.rotateAngleY;
		this.bipedEars.rotateAngleX = this.bipedHead.rotateAngleX;
		this.bipedEars.rotationPointX = 0;
		this.bipedEars.rotationPointY = 0;

		this.bipedEars.render(f);
	}

	@Override
	public void renderCloak(float f)
	{
		this.bipedCloak.render(f);
	}
}
