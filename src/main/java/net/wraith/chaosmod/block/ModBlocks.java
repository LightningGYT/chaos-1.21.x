package net.wraith.chaosmod.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.wraith.chaosmod.ChaosMod;

public class ModBlocks {
    // Ruby Block
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(Block.Settings.copy(Blocks.IRON_BLOCK)));

    // Normal Ruby Ore
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), Block.Settings.copy(Blocks.EMERALD_ORE)));

    // Deepslate Ruby Ore
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), Block.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)));


    // End grass Block
    public static final Block END_GRASS_BLOCK = registerBlock("end_grass_block",
            new Block(Block.Settings.copy(Blocks.END_STONE).mapColor(MapColor.PURPLE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ChaosMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(ChaosMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ChaosMod.LOGGER.info("Registering Mod Blocks for " + ChaosMod.MOD_ID);
    }
}
