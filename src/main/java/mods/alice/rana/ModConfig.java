package mods.alice.rana;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;
import mods.alice.rana.entity.passive.EntityRana;

public final class ModConfig
{
	public Configuration configFile;

	public ModConfig(File configFilePath)
	{
		this.configFile = new Configuration(configFilePath);
	}

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs)
	{
		if(eventArgs.modID.equals("ranamob"))
		{
			this.syncConfig();
		}
	}

	public void syncConfig()
	{
		EntityRana.rarityRana = configFile.getFloat("RarityRana", Configuration.CATEGORY_GENERAL, 5F, 1F, 1000F, "Rarity of Rana when spawn.");
		EntityRana.limitRana = configFile.getInt("LimitRana", Configuration.CATEGORY_GENERAL, 50, 1, 256, "");

		if(this.configFile.hasChanged())
		{
			this.configFile.save();
		}
	}

	public ConfigCategory getCategory(String category)
	{
		return this.configFile.getCategory(category);
	}

	@Override
	public String toString()
	{
		return this.configFile.toString();
	}
}
