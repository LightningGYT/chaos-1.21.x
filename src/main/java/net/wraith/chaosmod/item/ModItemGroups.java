package net.wraith.chaosmod.item;

import com.ibm.icu.impl.duration.impl.DataRecord;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.wraith.chaosmod.ChaosMod;
import net.wraith.chaosmod.block.EtherealBlocks;
import net.wraith.chaosmod.block.EtheriamBlocks;
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
                        entries.add(EtheriamBlocks.ETHERIAM_GRASS_BLOCK);
                        entries.add(EtheriamBlocks.ETHERIAM_LOG);
                        entries.add(EtheriamBlocks.ETHERIAM_WOOD);
                        entries.add(EtheriamBlocks.STRIPPED_ETHERIAM_LOG);
                        entries.add(EtheriamBlocks.STRIPPED_ETHERIAM_WOOD);
                        entries.add(EtheriamBlocks.ETHERIAM_PLANK);

                        entries.add(EtheriamBlocks.ETHERIAM_STAIRS);
                        entries.add(EtheriamBlocks.ETHERIAM_SLAB);
                        entries.add(EtheriamBlocks.ETHERIAM_BUTTON);
                        entries.add(EtheriamBlocks.ETHERIAM_PRESSURE_PLATE);
                        entries.add(EtheriamBlocks.ETHERIAM_FENCE);
                        entries.add(EtheriamBlocks.ETHERIAM_FENCE_GATE);
                        entries.add(EtheriamBlocks.ETHERIAM_DOOR);
                        entries.add(EtheriamBlocks.ETHERIAM_TRAPDOOR);;

                        entries.add(EtherealBlocks.ETHEREAL_ORE);
                        entries.add(EtherealItems.ETHEREAL_ESSENCE);
                        entries.add(EtherealItems.ETHEREAL_INGOT);
                        entries.add(EtherealItems.ETHEREAL_SWORD);
                        entries.add(EtherealItems.ETHEREAL_AXE);
                        entries.add(EtherealItems.ETHEREAL_PICKAXE);
                        entries.add(EtherealItems.ETHEREAL_SHOVEL);
                        entries.add(EtherealItems.ETHEREAL_HOE);

                        entries.add(EtherealItems.ETHEREAL_HELMET);
                        entries.add(EtherealItems.ETHEREAL_CHESTPLATE);
                        entries.add(EtherealItems.ETHEREAL_LEGGINGS);
                        entries.add(EtherealItems.ETHEREAL_BOOTS);
                    }).build());

    public static void registerItemGroups() {
        ChaosMod.LOGGER.info("Register Item Groups for " + ChaosMod.MOD_ID);
    }
}
