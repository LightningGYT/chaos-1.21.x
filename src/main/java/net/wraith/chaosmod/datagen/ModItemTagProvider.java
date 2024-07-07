package net.wraith.chaosmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.wraith.chaosmod.block.EtheriamBlocks;
import net.wraith.chaosmod.block.ModBlocks;
import net.wraith.chaosmod.item.EtherealItems;
import net.wraith.chaosmod.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // Logs
        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(EtheriamBlocks.ETHERIAM_LOG.asItem());

        // Pickaxes
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(EtherealItems.ETHEREAL_PICKAXE);

        // Swords
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(EtherealItems.ETHEREAL_SWORD);

        // Hoes
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(EtherealItems.ETHEREAL_HOE);

        // Shovels
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(EtherealItems.ETHEREAL_SHOVEL);

        // Axes
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(EtherealItems.ETHEREAL_AXE);

        // Planks
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(EtheriamBlocks.ETHERIAM_PLANK.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(EtheriamBlocks.ETHERIAM_LOG.asItem())
                .add(EtheriamBlocks.ETHERIAM_WOOD.asItem());

        // Etheriam logs
        getOrCreateTagBuilder(ModTags.Items.ETHERIAM_LOGS)
                .add(EtheriamBlocks.ETHERIAM_LOG.asItem())
                .add(EtheriamBlocks.ETHERIAM_WOOD.asItem())
                .add(EtheriamBlocks.STRIPPED_ETHERIAM_LOG.asItem())
                .add(EtheriamBlocks.STRIPPED_ETHERIAM_WOOD.asItem());
    }
}
