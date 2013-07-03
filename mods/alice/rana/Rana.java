package mods.alice.rana;

import java.util.logging.Logger;

import net.minecraftforge.common.Configuration;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "Rana", name="Rana", version = "1.7")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public final class Rana
{
	@Mod.Instance("Rana")
	public static Rana me;
	@SidedProxy(clientSide = "mods.alice.rana.client.ClientProxy", serverSide = "mods.alice.rana.CommonProxy")
	public static CommonProxy proxy;
	public static Logger log;

	@Mod.PreInit
	public void forgePreInitialization(FMLPreInitializationEvent event)
	{
		log = event.getModLog();
		ModConfig.loadConfigurations(new Configuration(event.getSuggestedConfigurationFile()));
	}

	@Mod.Init
	public void forgeInitialization(FMLInitializationEvent event)
	{
		proxy.loadLanguages();
		proxy.addMobs();
		proxy.registerRenderers();
	}
}
