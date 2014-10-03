package mods.alice.rana;

import java.util.ArrayList;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import mods.alice.rana.entity.passive.EntityRana;
import cpw.mods.fml.common.registry.EntityRegistry;

public class CommonProxy
{
	private static final BiomeGenBase biomesRana[];

	static
	{
		ArrayList<BiomeGenBase> biomes = new ArrayList<BiomeGenBase>();

		biomes.add(BiomeGenBase.plains);
		biomes.add(BiomeGenBase.extremeHills);
		biomes.add(BiomeGenBase.forest);
		biomes.add(BiomeGenBase.taiga);
		biomes.add(BiomeGenBase.swampland);
		biomes.add(BiomeGenBase.icePlains);
		biomes.add(BiomeGenBase.iceMountains);
		biomes.add(BiomeGenBase.forestHills);
		biomes.add(BiomeGenBase.taigaHills);
		biomes.add(BiomeGenBase.taigaHills);
		biomes.add(BiomeGenBase.jungle);
		biomes.add(BiomeGenBase.jungleHills);
		biomes.add(BiomeGenBase.jungleEdge);
		biomes.add(BiomeGenBase.birchForest);
		biomes.add(BiomeGenBase.birchForestHills);
		biomes.add(BiomeGenBase.roofedForest);
		biomes.add(BiomeGenBase.coldTaiga);
		biomes.add(BiomeGenBase.coldTaigaHills);
		biomes.add(BiomeGenBase.megaTaiga);
		biomes.add(BiomeGenBase.megaTaigaHills);
		biomes.add(BiomeGenBase.extremeHillsPlus);
		biomes.add(BiomeGenBase.savanna);
		biomes.add(BiomeGenBase.savannaPlateau);
		biomes.add(BiomeGenBase.mesa);
		biomes.add(BiomeGenBase.mesaPlateau_F);
		biomes.add(BiomeGenBase.mesaPlateau);

		biomesRana = biomes.toArray(new BiomeGenBase[biomes.size()]);
	}

	public void initialize()
	{
		// Mob Egg
		int id = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityRana.class, "Rana", id, 0x009000, 0xFFE0A0);

		// 登録
		EntityRegistry.registerModEntity(EntityRana.class, "Rana", 0, Rana.INSTANCE, 250, 1, true);

		// スポーンするバイオームを指定
		EntityRegistry.addSpawn(EntityRana.class, 14, 4, 4, EnumCreatureType.creature, biomesRana);
	}
}
