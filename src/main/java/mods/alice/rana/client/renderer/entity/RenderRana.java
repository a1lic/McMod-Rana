package mods.alice.rana.client.renderer.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.alice.rana.client.model.ModelRana;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public final class RenderRana extends RenderLiving
{
	private static final ModelBiped RANA;
	private static final ResourceLocation TEXTURE;

	static
	{
		RANA = new ModelRana();
		TEXTURE = new ResourceLocation("rana", "textures/mobs/newrana.png");
	}

	public RenderRana()
	{
		super(RenderRana.RANA, 0.3F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_)
	{
		return RenderRana.TEXTURE;
	}
}
