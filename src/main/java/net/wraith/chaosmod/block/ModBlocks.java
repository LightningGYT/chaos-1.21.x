package net.wraith.chaosmod.block;

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
    // NOTE: NOT AUTO GENERATED
    public static final Block ETHERIAM_GRASS_BLOCK = registerBlock("etheriam_grass_block",
            new Block(Block.Settings.copy(Blocks.END_STONE).mapColor(MapColor.PURPLE)));

    // Etheriam Log
    public static final Block ETHERIAM_LOG = registerBlock("etheriam_log",
            new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(0.5f)
            ));

    // Etheriam Wood
    public static final Block ETHERIAM_WOOD = registerBlock("etheriam_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(0.5f)
            ));

    // Etheriam Plank
    public static final Block ETHERIAM_PLANK = registerBlock("etheriam_plank",
            new Block(AbstractBlock.Settings.create()
                    .strength(3.0f, 4.0f)
                    .mapColor(MapColor.PURPLE)
                    ));

    // Etheriam Stairs
    public static final Block ETHERIAM_STAIRS = registerBlock("etheriam_stairs",
            new StairsBlock(ModBlocks.ETHERIAM_PLANK.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.ETHERIAM_PLANK)));

    // Etheriam Slab
    public static final Block ETHERIAM_SLAB = registerBlock("etheriam_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.ETHERIAM_PLANK)));

    // Etheriam Button
    public static final Block ETHERIAM_BUTTON = registerBlock("etheriam_button",
            new ButtonBlock(BlockSetType.OAK, 10, AbstractBlock.Settings.copy(ModBlocks.ETHERIAM_PLANK)));

    // Etheriam pressure plate
    public static final Block ETHERIAM_PRESSURE_PLATE = registerBlock("etheriam_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(ModBlocks.ETHERIAM_PLANK)));

    // Etheriam fence
    public static final Block ETHERIAM_FENCE = registerBlock("etheriam_fence",
            new FenceBlock(AbstractBlock.Settings.copy(ModBlocks.ETHERIAM_PLANK)));

    // Etheriam fence gate
    public static final Block ETHERIAM_FENCE_GATE = registerBlock("etheriam_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(ModBlocks.ETHERIAM_PLANK)));

    // Etheriam Door
    public static final Block ETHERIAM_DOOR = registerBlock("etheriam_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(ModBlocks.ETHERIAM_PLANK)
                    .nonOpaque()));

    // Etheriam Trap Door
    public static final Block ETHERIAM_TRAPDOOR = registerBlock("etheriam_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(ModBlocks.ETHERIAM_PLANK)
                    .nonOpaque()
            ));



    private static Block registerBlock(String name, Block block) {
        Item item = registerBlockItem(name, block);
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
