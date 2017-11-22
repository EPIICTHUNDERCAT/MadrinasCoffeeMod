package com.github.epiicthundercat.madrinascoffee.proxy;

import com.github.epiicthundercat.madrinascoffee.init.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	public void preInit(FMLPreInitializationEvent preEvent) {
		super.preInit(preEvent);

	}

	public void init(FMLInitializationEvent event) {
		super.init(event);

	}

	@Override
	public void registerRenders(FMLInitializationEvent event) {
		ModItems.registerRender(event);

	}
}
