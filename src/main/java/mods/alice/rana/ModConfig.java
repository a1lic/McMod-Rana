package mods.alice.rana;

import mods.alice.rana.utility.TypeTransformer;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public final class ModConfig
{
	public static byte idEntityRana;
	public static float rarityRana;
	public static short limitRana;

	public static void loadConfigurations(Configuration config)
	{
		Property p;

		config.load();

		p = config.get("entity", "Rana", 38);
		p.comment = "EntityId for Rana.";
		idEntityRana = getEntityId(p);

		p = config.get(Configuration.CATEGORY_GENERAL, "RarityRana", 5D);
		p.comment = "Rarity of Rana when spawn.";
		rarityRana = (float)p.getDouble(5);

		p = config.get(Configuration.CATEGORY_GENERAL, "LimitRana", 50);
		limitRana = (short)p.getInt();

		config.save();
	}

	static byte getEntityId(Property p)
	{
		return TypeTransformer.truncateIntToUnsignedByte(Math.min(Math.max(p.getInt(), 0), 255));
	}

	static short getItemId(Property p)
	{
		return (short)Math.min(Math.max(p.getInt(), 4096 - 256), 32767 - 256);
	}

	static short getBlockId(Property p)
	{
		return (short)Math.min(Math.max(p.getInt(), 1), 4095);
	}
}
