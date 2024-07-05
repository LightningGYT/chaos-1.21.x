package net.wraith.chaosmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.registry.RegistryWrapper;
import net.wraith.chaosmod.block.ModBlocks;
import net.wraith.chaosmod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    public LootTable.Builder etheriamGrassDrops(Block withSilkTouch, Item withoutSilkTouch) {
        return this.dropsWithSilkTouch(
                withSilkTouch,
                (LootPoolEntry.Builder<?>) this.applyExplosionDecay(
                        withSilkTouch, ItemEntry.builder(withoutSilkTouch)
                )
        );
    }

    @Override
    public void generate() {
        // Basic blocks
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.ETHERIAM_LOG);
        addDrop(ModBlocks.ETHERIAM_WOOD);
        addDrop(ModBlocks.ETHERIAM_PLANK);


        // Ores
        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY));

        // Other
        addDrop(ModBlocks.ETHERIAM_GRASS_BLOCK, etheriamGrassDrops(ModBlocks.ETHERIAM_GRASS_BLOCK, Blocks.END_STONE.asItem()));
    }
}
