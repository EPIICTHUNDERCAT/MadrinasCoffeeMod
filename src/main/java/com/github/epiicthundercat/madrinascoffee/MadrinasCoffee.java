package com.github.epiicthundercat.madrinascoffee;

import com.github.epiicthundercat.madrinascoffee.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MCGlobals.MODID, name = MCGlobals.MOD_NAME, version = MCGlobals.VERSION, acceptedMinecraftVersions = MCGlobals.ACCEPTEDVERSION)
public class MadrinasCoffee {
	@SidedProxy(clientSide = MCGlobals.CLIENT_PROXY, serverSide = MCGlobals.SERVER_PROXY)
	public static CommonProxy proxy;

	@EventHandler
	private void preInit(FMLPreInitializationEvent preEvent) {
		proxy.preInit(preEvent);
	}

	@EventHandler
	private void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
}