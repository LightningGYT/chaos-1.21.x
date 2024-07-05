package net.wraith.chaosmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
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
                .add(ModBlocks.ETHERIAM_GRASS_BLOCK);

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
                .add(ModBlocks.ETHERIAM_LOG)
                .add(ModBlocks.ETHERIAM_PLANK)
                .add(ModBlocks.ETHERIAM_WOOD)
                .add(ModBlocks.ETHERIAM_BUTTON)
                .add(ModBlocks.ETHERIAM_DOOR)
                .add(ModBlocks.ETHERIAM_FENCE)
                .add(ModBlocks.ETHERIAM_FENCE_GATE)
                .add(ModBlocks.ETHERIAM_SLAB)
                .add(ModBlocks.ETHERIAM_STAIRS)
                .add(ModBlocks.ETHERIAM_TRAPDOOR)
                .add(ModBlocks.ETHERIAM_PRESSURE_PLATE);

        // Logs
        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.ETHERIAM_LOG);

        // Planks
        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.ETHERIAM_PLANK);

        // Etheriam Logs
        getOrCreateTagBuilder(ModTags.Blocks.ETHERIAM_LOGS)
                .add(ModBlocks.ETHERIAM_WOOD)
                .add(ModBlocks.ETHERIAM_LOG);

        // Fences
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.ETHERIAM_FENCE);

        // Fence Gates
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.ETHERIAM_FENCE_GATE);


    }
}
