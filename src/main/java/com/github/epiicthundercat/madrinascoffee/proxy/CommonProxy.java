package com.github.epiicthundercat.madrinascoffee.proxy;

import com.github.epiicthundercat.madrinascoffee.init.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent preEvent) {
		register(preEvent);

	}

	public void init(FMLInitializationEvent event) {
		registerRenders(event);
		// ModConfigHandler.init();
		// ModRecipes.init();
	}

	private void register(FMLPreInitializationEvent preEvent) {
		ModItems.register(preEvent);
		// MinecraftForge.EVENT_BUS.register(new MobDropsHandler());

		// MinecraftForge.EVENT_BUS.register(new REventHandler());

	}

	public void registerRenders(FMLInitializationEvent event) {

	}

	public void registerRender(FMLInitializationEvent event) {
	}
}
