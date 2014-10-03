package mods.alice.rana.entity.passive;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public final class EntityRana extends EntityAnimal
{
	public static float rarityRana;
	public static int limitRana;
	public static final Item APPLE;
	public static final Item GOLDENAPPLE;

	static
	{
		APPLE = (Item)Item.itemRegistry.getObject("apple");
		GOLDENAPPLE = (Item)Item.itemRegistry.getObject("golden_apple");
	}

	public EntityRana(World world)
	{
		super(world);

		this.setSize(0.6F, 1.65F);

		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.2D));
		this.tasks.addTask(2, new EntityAIWander(this, 1D));
		this.tasks.addTask(3, new EntityAITempt(this, 1D, EntityRana.APPLE, false));
		this.tasks.addTask(3, new EntityAITempt(this, 1.5D, EntityRana.GOLDENAPPLE, false));
		this.tasks.addTask(4, new EntityAIWatchClosest(this, Entity.class, 6F, 0.05F));
		this.tasks.addTask(5, new EntityAILookIdle(this));

		//this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();

		IAttributeInstance attr = this.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
		attr.setBaseValue(0.25);

		attr = this.getEntityAttribute(SharedMonsterAttributes.maxHealth);
		attr.setBaseValue(14D);
	}

	@Override
	public boolean isAIEnabled()
	{
		return true;
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount)
	{
		if(source.damageType.compareTo("cactus") != 0)
		{
			return super.attackEntityFrom(source, amount);
		}
		return false;
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
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
	public void dropFewItems(boolean byPlayer, int looting)
	{
		this.entityDropItem(new ItemStack(EntityRana.APPLE, 1 + this.rand.nextInt(1 + looting)), 0);
	}

	@Override
	public void dropRareDrop(int superRare)
	{
		this.entityDropItem(new ItemStack(EntityRana.GOLDENAPPLE, 1, (superRare != 0) ? 1 : 0), 0);
	}

	@Override
	public boolean getCanSpawnHere()
	{
		return super.getCanSpawnHere();
	}

	@Override
	public boolean interact(EntityPlayer entityplayer)
	{
		return false;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entityageable)
	{
		return null;
	}
}
