package mods.alice.rana.client.gui;

import java.util.ArrayList;

import mods.alice.rana.ModConfig;
import mods.alice.rana.Rana;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.GuiConfigEntries;
import cpw.mods.fml.client.config.IConfigElement;

public final class ConfigGui extends GuiConfig
{
	@SuppressWarnings("rawtypes")
	public ConfigGui(GuiScreen parent)
	{
		// このWarning…まぁ、もうどうにもならんなぁ…
		super(parent, new ArrayList<IConfigElement>(), "ranamob", false, false, null);

		ModConfig config = Rana.INSTANCE.getConfig();
		ConfigCategory category = config.getCategory(Configuration.CATEGORY_GENERAL);
		ConfigElement<String> element = new ConfigElement<String>(category);

		this.configElements.addAll(element.getChildElements());
		this.entryList = new GuiConfigEntries(this, this.mc);
		this.title = GuiConfig.getAbridgedConfigPath(config.toString());
	}
}
