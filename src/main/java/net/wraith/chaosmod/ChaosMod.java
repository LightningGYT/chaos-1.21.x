package net.wraith.chaosmod;

import net.fabricmc.api.ModInitializer;

import net.wraith.chaosmod.block.ModBlocks;
import net.wraith.chaosmod.item.ModItemGroups;
import net.wraith.chaosmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChaosMod implements ModInitializer {
	public static final String MOD_ID = "chaosmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}