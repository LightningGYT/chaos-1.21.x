package net.wraith.chaosmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.wraith.chaosmod.ChaosMod;

public class Ethereal {

    public static final Block ETHEREAL_ORE = registerBlock("ethereal_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .strength(4.5f, 3.0f)
                            .mapColor(MapColor.PALE_YELLOW)
                            .requiresTool()
                            .luminance(state -> 3)
            ));

    private static Block registerBlock(String name, Block block) {
        Item item = registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ChaosMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(ChaosMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerEthereal() {}
}
