package mods.alice.rana.client;

import mods.alice.rana.CommonProxy;
import mods.alice.rana.client.renderer.entity.RenderRana;
import mods.alice.rana.entity.passive.EntityRana;
import net.minecraft.client.renderer.entity.Render;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderers()
	{
		Render rana = new RenderRana();
		RenderingRegistry.registerEntityRenderingHandler(EntityRana.class, rana);
	}
}
