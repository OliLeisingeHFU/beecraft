package net.olileisinger.beecraftmod;

import net.fabricmc.api.ModInitializer;
import net.olileisinger.beecraftmod.block.ModBlocks;
import net.olileisinger.beecraftmod.item.ModItems;
import net.olileisinger.beecraftmod.world.features.ModConfiguredFeatures;
import net.olileisinger.beecraftmod.world.gen.ModWorldGen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BeecraftMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("beecraftmod");
	public static final String MOD_ID = "beecraftmod";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModWorldGen.generateModWorldGen();

		LOGGER.info("Hello Fabric world!");
	}
}
