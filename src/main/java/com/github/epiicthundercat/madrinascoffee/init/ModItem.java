package com.github.epiicthundercat.madrinascoffee.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItem  extends Item {

	public ModItem(String name) {
		super();
		this.setRegistryName(name.toLowerCase());
		this.setUnlocalizedName(name.toLowerCase());
		this.setCreativeTab(CreativeTabs.FOOD);
	 	addToItems(this);
	}

	private void addToItems(Item item) {

		ModItems.items.add(item);

	}
	
	
	
}
