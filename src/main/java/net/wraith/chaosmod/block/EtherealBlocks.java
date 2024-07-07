package net.wraith.chaosmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.wraith.chaosmod.ChaosMod;

import static net.wraith.chaosmod.block.ModBlocks.registerBlock;

public class EtherealBlocks {

    public static final Block ETHEREAL_ORE = registerBlock("ethereal_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .strength(4.5f, 3.0f)
                            .mapColor(MapColor.PALE_YELLOW)
                            .requiresTool()
                            .luminance(state -> 3)
            ));



    public static void registerEthereal() {}
}
