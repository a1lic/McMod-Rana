package mods.alice.rana.entity.passive;

import mods.alice.rana.ModConfig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityRana extends EntityAnimal
{
	public EntityRana(World world)
	{
		super(world);
		texture = "/mods/alice/rana/mob/newrana.png";
		moveSpeed = 0.25F;
		setSize(0.6F, 1.65F);

		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIPanic(this, moveSpeed * 1.5F));
		tasks.addTask(2, new EntityAIWander(this, moveSpeed));
		tasks.addTask(3, new EntityAIWatchClosest(this, Entity.class, 6F));
		tasks.addTask(4, new EntityAILookIdle(this));
		//targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
	}

	@Override
	public boolean isAIEnabled()
	{
		return true;
	}

	@Override
	protected void damageEntity(DamageSource source, int amount)
	{
		if(source.damageType.compareTo("cactus") != 0)
		{
			super.damageEntity(source, amount);
		}
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
	}

	@Override
	public boolean isInRangeToRenderDist(double d)
	{
		double d1 = boundingBox.getAverageEdgeLength();
		d1 *= 64D * renderDistanceWeight;
		return d < d1 * d1;
	}

	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound)
	{
		super.writeToNBT(nbttagcompound);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound)
	{
		super.readFromNBT(nbttagcompound);
	}

	@Override
	protected int getDropItemId()
	{
		if(rand.nextInt(100) == 0)
		{
			return Item.appleGold.itemID;
		}
		if(rand.nextInt(8) == 0)
		{
			return Item.appleRed.itemID;
		}
		else
		{
			return 0;
		}
	}

	@Override
	public int getMaxSpawnedInChunk()
	{
		return 1;
	}

	@Override
	public boolean getCanSpawnHere()
	{
		int i = (int)Math.floor(posX);
		int j = (int)Math.floor(boundingBox.minY);
		int k = (int)Math.floor(posZ);
		int l = 0;
		if(worldObj.getBlockLightValue(i, j, k) < 7)
		{
			l = rand.nextInt(2);
		}
		boolean flag = (l == 0) && (worldObj.getBlockId(i, j - 1, k) <= 6) && (worldObj.getBlockId(i, j - 1, k) != 0) && super.getCanSpawnHere() && ((ModConfig.rarityRana > 1.0F) || (rand.nextFloat() < ModConfig.rarityRana)) && (getRanaCount() <= ModConfig.limitRana);
		return flag;
	}

	@Override
	public boolean interact(EntityPlayer entityplayer)
	{
		return false;
	}

	public int getRanaCount()
	{
		return worldObj.countEntities(EntityRana.class);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entityageable)
	{
		return null;
	}

	@Override
	public int getMaxHealth()
	{
		return 15;
	}
}
