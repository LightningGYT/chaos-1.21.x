package net.wraith.chaosmod.block;

import net.minecraft.block.*;

import static net.wraith.chaosmod.block.ModBlocks.registerBlock;


public class EtheriamBlocks {

    // End grass Block
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

    public static final Block STRIPPED_ETHERIAM_LOG = registerBlock("stripped_etheriam_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(0.5f)));

    public static final Block STRIPPED_ETHERIAM_WOOD = registerBlock("stripped_etheriam_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(0.5f)));

    // Etheriam Plank
    public static final Block ETHERIAM_PLANK = registerBlock("etheriam_plank",
            new Block(AbstractBlock.Settings.create()
                    .strength(3.0f, 4.0f)
                    .mapColor(MapColor.PURPLE)
            ));

    // Etheriam Stairs
    public static final Block ETHERIAM_STAIRS = registerBlock("etheriam_stairs",
            new StairsBlock(EtheriamBlocks.ETHERIAM_PLANK.getDefaultState(),
                    AbstractBlock.Settings.copy(EtheriamBlocks.ETHERIAM_PLANK)));

    // Etheriam Slab
    public static final Block ETHERIAM_SLAB = registerBlock("etheriam_slab",
            new SlabBlock(AbstractBlock.Settings.copy(EtheriamBlocks.ETHERIAM_PLANK)));

    // Etheriam Button
    public static final Block ETHERIAM_BUTTON = registerBlock("etheriam_button",
            new ButtonBlock(BlockSetType.OAK, 10, AbstractBlock.Settings.copy(EtheriamBlocks.ETHERIAM_PLANK)));

    // Etheriam pressure plate
    public static final Block ETHERIAM_PRESSURE_PLATE = registerBlock("etheriam_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(EtheriamBlocks.ETHERIAM_PLANK)));

    // Etheriam fence
    public static final Block ETHERIAM_FENCE = registerBlock("etheriam_fence",
            new FenceBlock(AbstractBlock.Settings.copy(EtheriamBlocks.ETHERIAM_PLANK)));

    // Etheriam fence gate
    public static final Block ETHERIAM_FENCE_GATE = registerBlock("etheriam_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(EtheriamBlocks.ETHERIAM_PLANK)));

    // Etheriam Door
    public static final Block ETHERIAM_DOOR = registerBlock("etheriam_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(EtheriamBlocks.ETHERIAM_PLANK)
                    .nonOpaque()));

    // Etheriam Trap Door
    public static final Block ETHERIAM_TRAPDOOR = registerBlock("etheriam_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(EtheriamBlocks.ETHERIAM_PLANK)
                    .nonOpaque()
            ));



    public static void registerEtheriamBlocks() {

    }
}
