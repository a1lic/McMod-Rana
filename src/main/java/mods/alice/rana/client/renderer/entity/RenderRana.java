package mods.alice.rana.client.renderer.entity;

import mods.alice.rana.client.model.ModelRana;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;

public class RenderRana extends RenderBiped
{
	static final ModelBiped rana;

	static
	{
		rana = new ModelRana();
	}

	public RenderRana()
	{
		super(rana, 0.3F);
	}
}
