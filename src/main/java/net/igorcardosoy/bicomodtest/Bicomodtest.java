package net.igorcardosoy.bicomodtest;

import net.fabricmc.api.ModInitializer;

import net.igorcardosoy.bicomodtest.block.ModBlocks;
import net.igorcardosoy.bicomodtest.item.ModItemGroups;
import net.igorcardosoy.bicomodtest.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bicomodtest implements ModInitializer {
	public static final String MOD_ID = "bicomodtest";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}