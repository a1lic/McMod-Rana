package mods.alice.rana;

import java.util.ArrayList;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import mods.alice.rana.entity.passive.EntityRana;
import mods.alice.rana.utility.TypeTransformer;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonProxy
{
	static final BiomeGenBase biomesRana[];

	static
	{
		ArrayList<BiomeGenBase> biomes;

		biomes = new ArrayList<BiomeGenBase>();
		biomes.add(BiomeGenBase.plains);
		biomes.add(BiomeGenBase.extremeHills);
		biomes.add(BiomeGenBase.extremeHillsEdge);
		biomes.add(BiomeGenBase.icePlains);
		biomes.add(BiomeGenBase.iceMountains);
		biomes.add(BiomeGenBase.taiga);
		biomes.add(BiomeGenBase.taigaHills);

		biomesRana = biomes.toArray(new BiomeGenBase[biomes.size()]);
	}

	public void registerRenderers()
	{
	}

	void addMobs()
	{
		EntityRegistry.registerGlobalEntityID(EntityRana.class, "Rana", TypeTransformer.expandUnsignedByteToInt(ModConfig.idEntityRana), 0x009000, 0xFFE0A0);
		EntityRegistry.registerModEntity(EntityRana.class, "Rana", 0, Rana.me, 80, 3, true);
		EntityRegistry.addSpawn(EntityRana.class, 4, 2, 4, EnumCreatureType.creature, biomesRana);
		Rana.log.info(String.format("Entity `%s' is registered with %d.", "Rana", ModConfig.idEntityRana));
	}

	void loadLanguages()
	{
		LanguageRegistry lang = LanguageRegistry.instance();
		assert (lang != null) : "LanguageRegistry instance.";

		lang.loadLocalization("/mods/alice/rana/lang/en_US.lang", "en_US", false);
		lang.loadLocalization("/mods/alice/rana/lang/ja_JP.lang", "ja_JP", false);
	}
}
