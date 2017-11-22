package com.github.epiicthundercat.madrinascoffee.coffes;

import com.github.epiicthundercat.madrinascoffee.init.ModCoffee;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CafeCaramel extends ModCoffee{

	private int effectTime = 1400;
	
	
	public CafeCaramel(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
		EntityPlayer entityplayer = entityLiving instanceof EntityPlayer ? (EntityPlayer) entityLiving : null;

		if (entityplayer == null || !entityplayer.capabilities.isCreativeMode) {
			stack.shrink(1);
		}

		if (entityplayer instanceof EntityPlayerMP) {
			CriteriaTriggers.CONSUME_ITEM.trigger((EntityPlayerMP) entityplayer, stack);
		}

		if (!worldIn.isRemote) {

			entityLiving.addPotionEffect(new PotionEffect(MobEffects.SPEED, effectTime, 10, true, false));
			
		}

		return stack;

	}
	
	
	
	
	
}
