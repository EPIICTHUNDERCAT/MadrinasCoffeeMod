package com.github.epiicthundercat.madrinascoffee.init;

import java.util.ArrayList;
import java.util.List;

import com.github.epiicthundercat.madrinascoffee.coffes.CafeCaramel;
import com.github.epiicthundercat.madrinascoffee.coffes.CafeMocha;
import com.github.epiicthundercat.madrinascoffee.coffes.CafeVanilla;
import com.github.epiicthundercat.madrinascoffee.coffes.Cappuccino;
import com.github.epiicthundercat.madrinascoffee.coffes.TwoXDarkRoastCoffee;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModItems {

	public static List<Item> items = new ArrayList();
	public static Item madrinascoffee_2xdarkroast = new TwoXDarkRoastCoffee("madrinascoffee_2xdarkroast");
	public static Item madrinascoffee_cappuccino = new Cappuccino("madrinascoffee_cappuccino");
	public static Item madrinascoffee_cafevanilla = new CafeVanilla("madrinascoffee_cafevanilla");
	public static Item madrinascoffee_cafemocha = new CafeMocha("madrinascoffee_cafemocha");
	public static Item madrinascoffee_cafecaramel = new CafeCaramel("madrinascoffee_cafecaramel");
	public static Item madrinascoffee_africamicroroast = new ModItem("madrinascoffee_africamicroroast");
	public static Item madrinascoffee_panasiamicroroast = new ModItem("madrinascoffee_panasiamicroroast");
	public static Item madrinascoffee_americasmicroroast = new ModItem("madrinascoffee_americasmicroroast");
	public static Item madrinascoffee_pagaeamicroroast = new ModItem("madrinascoffee_pagaeamicroroast");

	
	//Shirts
	
	private static List<Item> getItems() {
		return items;

	}

	public static void register(FMLPreInitializationEvent preEvent) {
		for (Item item : getItems()) {

			ForgeRegistries.ITEMS.register(item);
		}
	}

	public static void registerRender(FMLInitializationEvent event) {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		for (Item item : getItems()) {
			renderItem.getItemModelMesher().register(item, 0,
					new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
		}
	}
}
