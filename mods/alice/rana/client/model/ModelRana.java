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
	public ModelRenderer b1;
	public ModelRenderer b2;
	public ModelRenderer b3;
	public ModelRenderer b4;
	public ModelRenderer b5;
	public ModelRenderer b6;
	public ModelRenderer b7;
	public ModelRenderer b8;
	public ModelRenderer b9;
	public ModelRenderer b10;
	public ModelRenderer b11;
	public ModelRenderer b12;
	public ModelRenderer b13;
	public ModelRenderer b14;
	public ModelRenderer b15;
	public ModelRenderer c1;
	public ModelRenderer c2;
	public ModelRenderer c3;
	public ModelRenderer d1;
	public ModelRenderer e1;
	public ModelRenderer f9;
	public ModelRenderer g9;

	public ModelRana()
	{
		heldItemLeft = 0;
		heldItemRight = 0;
		isSneak = false;

		bipedCloak = new ModelRenderer(this, 0, 0);
		bipedCloak.addBox(-5F, offsetY, -1F, 10, 16, 1, 0);

		bipedEars = new ModelRenderer(this, 24, 0);
		bipedEars.addBox(-3F, offsetY - 6F, -1F, 6, 6, 1, 0);

		bipedHead = new ModelRenderer(this, 0, 0);
		bipedHead.addBox(-4F, offsetY - 8F, -4F, 8, 8, 8, 0);
		bipedHead.setRotationPoint(0, 0, 0);

		bipedHeadwear = new ModelRenderer(this, 32, 0);
		bipedHeadwear.addBox(-4F, offsetY - 7.75F, -4F, 8, 3, 8, 0.75F);
		bipedHeadwear.setRotationPoint(0, 0, 0);

		b1 = new ModelRenderer(this, 24, 2);
		b1.addBox(-5, offsetY - 11, -3, 4, 3, 3, -0.125F);
		b1.setRotationPoint(0, 0, 0);

		b2 = new ModelRenderer(this, 24, 2);
		b2.addBox(1, offsetY - 11, -3, 4, 3, 3, -0.125F);
		b2.setRotationPoint(0, 0, 0);

		b14 = new ModelRenderer(this, 48, 13);
		b14.addBox(-4, offsetY - 10, -3.5F, 2, 2, 2, -0.375F);
		b14.setRotationPoint(0, 0, 0);

		b15 = new ModelRenderer(this, 48, 13);
		b15.addBox(2, offsetY - 10, -3.5F, 2, 2, 2, -0.375F);
		b15.setRotationPoint(0, 0, 0);

		b3 = new ModelRenderer(this, 9, 16);
		b3.addBox(-4, offsetY - 3, 4, 3, 3, 1, -0.25F);
		b3.setRotationPoint(0, 0, 0);

		b4 = new ModelRenderer(this, 9, 16);
		b4.addBox(1, offsetY - 3, 4, 3, 3, 1, -0.25F);
		b4.setRotationPoint(0, 0, 0);

		b5 = new ModelRenderer(this, 29, 16);
		b5.addBox(-3.5F, offsetY - 2.5F, 4, 2, 2, 2, 0);
		b5.setRotationPoint(0, 0, 0);

		b6 = new ModelRenderer(this, 29, 16);
		b6.addBox(1.5F, offsetY - 2.5F, 4, 2, 2, 2, 0);
		b6.setRotationPoint(0, 0, 0);

		b7 = new ModelRenderer(this, 0, 0);
		b7.addBox(-5.5F, offsetY - 1.5F, 5, 3, 3, 3, 0);
		b7.setRotationPoint(0, 0, 0);

		b8 = new ModelRenderer(this, 0, 0);
		b8.addBox(2.5F, offsetY - 1.5F, 5, 3, 3, 3, 0);
		b8.setRotationPoint(0, 0, 0);

		b9 = new ModelRenderer(this, 43, 13);
		b9.addBox(-4, offsetY - 4.625F, -3, 1, 4, 1, 0.5F);
		b9.setRotationPoint(0, 0, 0);

		b10 = new ModelRenderer(this, 43, 13);
		b10.addBox(3, offsetY - 4.625F, -3, 1, 4, 1, 0.5F);
		b10.setRotationPoint(0, 0, 0);

		b11 = new ModelRenderer(this, 29, 16);
		b11.addBox(-2, offsetY - 4.5F, -4.625F, 2, 2, 2, -0.5F);
		b11.setRotationPoint(0, 0, 0);

		b12 = new ModelRenderer(this, 29, 16);
		b12.addBox(-1, offsetY - 4.5F, -4.5F, 2, 2, 2, -0.375F);
		b12.setRotationPoint(0, 0, 0);

		b13 = new ModelRenderer(this, 29, 16);
		b13.addBox(0, offsetY - 4.5F, -4.625F, 2, 2, 2, -0.5F);
		b13.setRotationPoint(0, 0, 0);

		bipedBody = new ModelRenderer(this, 14, 17);
		bipedBody.addBox(-4, offsetY + 0.5F, -2, 6, 10, 3, 0.5F);
		bipedBody.setRotationPoint(1, 0, 0);

		c1 = new ModelRenderer(this, 46, 17);
		c1.addBox(-3, offsetY + 1, 1, 4, 5, 2, 0.5F);
		c1.setRotationPoint(1, 0, 0);

		c2 = new ModelRenderer(this, 58, 17);
		c2.addBox(-1.5F, offsetY, -2.625F, 1, 10, 1, 0);
		c2.setRotationPoint(1, 0, 0);

		c3 = new ModelRenderer(this, 3, 18);
		c3.addBox(0.5F, offsetY + 3.25F, -2.25F, 1, 1, 1, 0.625F);
		c3.setRotationPoint(1, 0, 0);

		bipedRightArm = new ModelRenderer(this, 34, 17);
		bipedRightArm.addBox(-3 + offsetY45, offsetY - 2, -2, 3, 10, 3, 0);
		bipedRightArm.setRotationPoint(-5, 3, 0);

		bipedLeftArm = new ModelRenderer(this, 34, 17);
		bipedLeftArm.mirror = true;
		bipedLeftArm.addBox(-1 - offsetY45, offsetY - 2, -2, 3, 10, 3, 0);
		bipedLeftArm.setRotationPoint(5, 3, 0);

		d1 = new ModelRenderer(this, 46, 25);
		d1.addBox(-3 + offsetY45, offsetY + 4, -2, 3, 2, 3, 0.25F);
		d1.setRotationPoint(-5, 3, 0);

		e1 = new ModelRenderer(this, 46, 25);
		e1.mirror = true;
		e1.addBox(-1 - offsetY45, offsetY + 4, -2, 3, 2, 3, 0.25F);
		e1.setRotationPoint(5, 3, 0);

		bipedRightLeg = new ModelRenderer(this, 0, 17);
		bipedRightLeg.addBox(-2, offsetY - 2, -2, 3, 10, 3, 0);
		bipedRightLeg.setRotationPoint(-1, 12, 0);

		bipedLeftLeg = new ModelRenderer(this, 0, 17);
		bipedLeftLeg.mirror = true;
		bipedLeftLeg.addBox(-2, offsetY - 2, -2, 3, 10, 3, 0);
		bipedLeftLeg.setRotationPoint(2, 12, 0);

		f9 = new ModelRenderer(this, 32, 13);
		f9.addBox(-2, offsetY + 6, -3, 3, 2, 1, 0);
		f9.setRotationPoint(-1, 12, 0);

		g9 = new ModelRenderer(this, 32, 13);
		g9.mirror = true;
		g9.addBox(-2, offsetY + 6, -3, 3, 2, 1, 0);
		g9.setRotationPoint(2, 12, 0);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		bipedHead.render(f5);
		bipedBody.render(f5);
		bipedRightArm.render(f5);
		bipedLeftArm.render(f5);
		bipedRightLeg.render(f5);
		bipedLeftLeg.render(f5);
		bipedHeadwear.render(f5);
		b1.render(f5);
		b2.render(f5);
		b3.render(f5);
		b4.render(f5);
		b5.render(f5);
		b6.render(f5);
		b7.render(f5);
		b8.render(f5);
		b9.render(f5);
		b10.render(f5);
		b11.render(f5);
		b12.render(f5);
		b13.render(f5);
		b14.render(f5);
		b15.render(f5);
		c1.render(f5);
		c2.render(f5);
		c3.render(f5);
		d1.render(f5);
		e1.render(f5);
		f9.render(f5);
		g9.render(f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par7Entity)
	{
		bipedHead.rotateAngleY = f3 / 57.3F;
		bipedHead.rotateAngleX = f4 / 57.3F;
		b14.rotateAngleY = b15.rotateAngleY = b11.rotateAngleY = b12.rotateAngleY = b13.rotateAngleY = b9.rotateAngleY = b10.rotateAngleY = b7.rotateAngleY = b8.rotateAngleY = b5.rotateAngleY = b6.rotateAngleY = b3.rotateAngleY = b4.rotateAngleY = b1.rotateAngleY = b2.rotateAngleY = bipedHeadwear.rotateAngleY = bipedHead.rotateAngleY;
		b14.rotateAngleX = b15.rotateAngleX = b11.rotateAngleX = b12.rotateAngleX = b13.rotateAngleX = b9.rotateAngleX = b10.rotateAngleX = b7.rotateAngleX = b8.rotateAngleX = b5.rotateAngleX = b6.rotateAngleX = b3.rotateAngleX = b4.rotateAngleX = b1.rotateAngleX = b2.rotateAngleX = bipedHeadwear.rotateAngleX = bipedHead.rotateAngleX;
		bipedRightArm.rotateAngleX = (float)Math.cos(f * 0.6 + Math.PI) * 2 * f1 * 0.5F;
		bipedLeftArm.rotateAngleX = (float)Math.cos(f * 0.6) * 2 * f1 * 0.5F;
		bipedRightArm.rotateAngleZ = 0;
		bipedLeftArm.rotateAngleZ = 0;
		f9.rotateAngleX = bipedRightLeg.rotateAngleX = (float)Math.cos(f * 0.6) * 1.4F * f1;
		g9.rotateAngleX = bipedLeftLeg.rotateAngleX = (float)Math.cos(f * 0.6 + Math.PI) * 1.4F * f1;
		f9.rotateAngleY = bipedRightLeg.rotateAngleY = 0;
		g9.rotateAngleY = bipedLeftLeg.rotateAngleY = 0;
		if(isRiding)
		{
			bipedRightArm.rotateAngleX += -(Math.PI / 5);
			bipedLeftArm.rotateAngleX += -(Math.PI / 5);
			f9.rotateAngleX = bipedRightLeg.rotateAngleX = -1.25F;
			g9.rotateAngleX = bipedLeftLeg.rotateAngleX = -1.25F;
			f9.rotateAngleY = bipedRightLeg.rotateAngleY = (float)(Math.PI / 10);
			g9.rotateAngleY = bipedLeftLeg.rotateAngleY = (float)-(Math.PI / 10);
		}
		if(heldItemLeft != 0)
		{
			bipedLeftArm.rotateAngleX = bipedLeftArm.rotateAngleX * 0.5F - (float)(Math.PI / 10);
		}
		if(heldItemRight != 0)
		{
			bipedRightArm.rotateAngleX = bipedRightArm.rotateAngleX * 0.5F - (float)(Math.PI / 10);
		}
		bipedRightArm.rotateAngleY = 0;
		bipedLeftArm.rotateAngleY = 0;
		if(onGround > -9990F)
		{
			float f6 = onGround;
			c3.rotateAngleY = c2.rotateAngleY = c1.rotateAngleY = bipedBody.rotateAngleY = (float)Math.sin(Math.sqrt(f6) * Math.PI * 2) * 0.2F;
			bipedRightArm.rotationPointZ = (float)Math.sin(bipedBody.rotateAngleY) * 5F;
			d1.rotationPointZ = (float)Math.sin(bipedBody.rotateAngleY) * 5F;
			bipedRightArm.rotationPointX = (float)-Math.cos(bipedBody.rotateAngleY) * 5F + 2F;
			d1.rotationPointX = (float)-Math.cos(bipedBody.rotateAngleY) * 5F + 2F;
			bipedLeftArm.rotationPointZ = (float)-Math.sin(bipedBody.rotateAngleY) * 5F;
			e1.rotationPointZ = (float)-Math.sin(bipedBody.rotateAngleY) * 5F;
			bipedLeftArm.rotationPointX = (float)Math.cos(bipedBody.rotateAngleY) * 5F - 1F;
			e1.rotationPointX = (float)Math.cos(bipedBody.rotateAngleY) * 5F - 1F;
			bipedRightArm.rotateAngleY += bipedBody.rotateAngleY;
			bipedLeftArm.rotateAngleY += bipedBody.rotateAngleY;
			bipedLeftArm.rotateAngleX += bipedBody.rotateAngleY;
			f6 = 1 - onGround;
			f6 *= f6;
			f6 *= f6;
			f6 = 1 - f6;
			float f7 = (float)Math.sin(f6 * Math.PI);
			float f8 = (float)Math.sin(onGround * Math.PI) * -(bipedHead.rotateAngleX - 0.7F) * 0.75F;
			bipedRightArm.rotateAngleX -= (double)f7 * 1.2 + (double)f8;
			bipedRightArm.rotateAngleY += bipedBody.rotateAngleY * 2F;
			bipedRightArm.rotateAngleZ = (float)Math.sin(onGround * Math.PI) * -0.4F;
		}
		if(isSneak)
		{
			c3.rotateAngleX = c2.rotateAngleX = c1.rotateAngleX = bipedBody.rotateAngleX = 0.5F;
			//bipedRightLeg.rotateAngleX -= 0.0F;
			//bipedLeftLeg.rotateAngleX -= 0.0F;
			bipedRightArm.rotateAngleX += 0.4F;
			bipedLeftArm.rotateAngleX += 0.4F;
			f9.rotationPointZ = bipedRightLeg.rotationPointZ = 4F;
			g9.rotationPointZ = bipedLeftLeg.rotationPointZ = 4F;
			f9.rotationPointY = bipedRightLeg.rotationPointY = 9F;
			g9.rotationPointY = bipedLeftLeg.rotationPointY = 9F;
			bipedHead.rotationPointY = 1F;
		}
		else
		{
			c3.rotateAngleX = c2.rotateAngleX = c1.rotateAngleX = bipedBody.rotateAngleX = 0;
			f9.rotationPointZ = bipedRightLeg.rotationPointZ = 0;
			g9.rotationPointZ = bipedLeftLeg.rotationPointZ = 0;
			f9.rotationPointY = bipedRightLeg.rotationPointY = 12F;
			g9.rotationPointY = bipedLeftLeg.rotationPointY = 12F;
			bipedHead.rotationPointY = 0;
		}
		bipedRightArm.rotateAngleZ += 0.5F;
		bipedLeftArm.rotateAngleZ -= 0.5F;
		bipedRightArm.rotateAngleZ += (float)Math.cos(f2 * 0.09F) * 0.05F + 0.05F;
		bipedLeftArm.rotateAngleZ -= (float)Math.cos(f2 * 0.09F) * 0.05F + 0.05F;
		bipedRightArm.rotateAngleX += (float)Math.sin(f2 * 0.067F) * 0.05F;
		bipedLeftArm.rotateAngleX -= (float)Math.sin(f2 * 0.067F) * 0.05F;
		d1.rotateAngleX = bipedRightArm.rotateAngleX;
		d1.rotateAngleY = bipedRightArm.rotateAngleY;
		d1.rotateAngleZ = bipedRightArm.rotateAngleZ;
		e1.rotateAngleX = bipedLeftArm.rotateAngleX;
		e1.rotateAngleY = bipedLeftArm.rotateAngleY;
		e1.rotateAngleZ = bipedLeftArm.rotateAngleZ;
	}

	@Override
	public void renderEars(float f)
	{
		bipedEars.rotateAngleY = bipedHead.rotateAngleY;
		bipedEars.rotateAngleX = bipedHead.rotateAngleX;
		bipedEars.rotationPointX = 0;
		bipedEars.rotationPointY = 0;
		bipedEars.render(f);
	}

	@Override
	public void renderCloak(float f)
	{
		bipedCloak.render(f);
	}
}
