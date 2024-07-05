package net.wraith.chaosmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.wraith.chaosmod.ChaosMod;
import net.wraith.chaosmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CHAOS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ChaosMod.MOD_ID, "chaos"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chaos"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        // Items
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.ROTTEN_TOMATO);
                        entries.add(ModItems.TOMATO_SAUCE);
                        entries.add(ModItems.LETTUCE);

                        // Block Items
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.ETHERIAM_GRASS_BLOCK);
                        entries.add(ModBlocks.ETHERIAM_LOG);
                        entries.add(ModBlocks.ETHERIAM_WOOD);
                        entries.add(ModBlocks.ETHERIAM_PLANK);

                        entries.add(ModBlocks.ETHERIAM_STAIRS);
                        entries.add(ModBlocks.ETHERIAM_SLAB);
                        entries.add(ModBlocks.ETHERIAM_BUTTON);
                        entries.add(ModBlocks.ETHERIAM_PRESSURE_PLATE);
                        entries.add(ModBlocks.ETHERIAM_FENCE);
                        entries.add(ModBlocks.ETHERIAM_FENCE_GATE);
                        entries.add(ModBlocks.ETHERIAM_DOOR);
                        entries.add(ModBlocks.ETHERIAM_TRAPDOOR);
                    }).build());

    public static void registerItemGroups() {
        ChaosMod.LOGGER.info("Register Item Groups for " + ChaosMod.MOD_ID);
    }
}
