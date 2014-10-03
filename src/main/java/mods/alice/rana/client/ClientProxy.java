package mods.alice.rana.client;

import mods.alice.rana.CommonProxy;
import mods.alice.rana.client.renderer.entity.RenderRana;
import mods.alice.rana.entity.passive.EntityRana;
import net.minecraft.client.renderer.entity.Render;
import cpw.mods.fml.client.registry.RenderingRegistry;

public final class ClientProxy extends CommonProxy
{
	@Override
	public void initialize()
	{
		super.initialize();

		Render rana = new RenderRana();
		RenderingRegistry.registerEntityRenderingHandler(EntityRana.class, rana);
	}
}
