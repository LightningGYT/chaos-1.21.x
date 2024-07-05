package net.wraith.chaosmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.wraith.chaosmod.block.EtheriamBlocks;
import net.wraith.chaosmod.block.ModBlocks;
import net.wraith.chaosmod.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // Pickaxe
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(EtheriamBlocks.ETHERIAM_GRASS_BLOCK);

        // Needs Stone tools
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RUBY_BLOCK);

        // Needs Iron tools
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE);

        // Needs Diamond tools
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        // Axe
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(EtheriamBlocks.ETHERIAM_LOG)
                .add(EtheriamBlocks.ETHERIAM_PLANK)
                .add(EtheriamBlocks.ETHERIAM_WOOD)
                .add(EtheriamBlocks.ETHERIAM_BUTTON)
                .add(EtheriamBlocks.ETHERIAM_DOOR)
                .add(EtheriamBlocks.ETHERIAM_FENCE)
                .add(EtheriamBlocks.ETHERIAM_FENCE_GATE)
                .add(EtheriamBlocks.ETHERIAM_SLAB)
                .add(EtheriamBlocks.ETHERIAM_STAIRS)
                .add(EtheriamBlocks.ETHERIAM_TRAPDOOR)
                .add(EtheriamBlocks.ETHERIAM_PRESSURE_PLATE);

        // Logs
        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(EtheriamBlocks.ETHERIAM_LOG);

        // Planks
        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(EtheriamBlocks.ETHERIAM_PLANK);

        // Etheriam Logs
        getOrCreateTagBuilder(ModTags.Blocks.ETHERIAM_LOGS)
                .add(EtheriamBlocks.ETHERIAM_WOOD)
                .add(EtheriamBlocks.ETHERIAM_LOG);

        // Fences
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(EtheriamBlocks.ETHERIAM_FENCE);

        // Fence Gates
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(EtheriamBlocks.ETHERIAM_FENCE_GATE);


    }
}
