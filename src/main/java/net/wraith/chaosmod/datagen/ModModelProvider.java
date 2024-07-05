package net.wraith.chaosmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.wraith.chaosmod.block.ModBlocks;
import net.wraith.chaosmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }



    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        // Ores
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);

        // Wood
        blockStateModelGenerator.registerLog(ModBlocks.ETHERIAM_LOG).log(ModBlocks.ETHERIAM_LOG).wood(ModBlocks.ETHERIAM_WOOD);


        // Blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);

        // Etheriam Grass
        TextureMap textureMap = new TextureMap()
                .put(TextureKey.BOTTOM, TextureMap.getId(Blocks.END_STONE))
                .put(TextureKey.TOP, TextureMap.getId(ModBlocks.ETHERIAM_GRASS_BLOCK))
                .put(TextureKey.SIDE, TextureMap.getSubId(ModBlocks.ETHERIAM_GRASS_BLOCK, "_side"));
        blockStateModelGenerator.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(
                        ModBlocks.ETHERIAM_GRASS_BLOCK,
                        BlockStateVariant.create()
                                .put(VariantSettings.MODEL, Models.CUBE_BOTTOM_TOP.upload(
                                        ModBlocks.ETHERIAM_GRASS_BLOCK,
                                        textureMap,
                                        blockStateModelGenerator.modelCollector
                                ))
                ));



        // Etheriam Plank things
        BlockStateModelGenerator.BlockTexturePool etheriamPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ETHERIAM_PLANK);

        etheriamPlankPool.stairs(ModBlocks.ETHERIAM_STAIRS);
        etheriamPlankPool.slab(ModBlocks.ETHERIAM_SLAB);
        etheriamPlankPool.button(ModBlocks.ETHERIAM_BUTTON);
        etheriamPlankPool.pressurePlate(ModBlocks.ETHERIAM_PRESSURE_PLATE);
        etheriamPlankPool.fence(ModBlocks.ETHERIAM_FENCE);
        etheriamPlankPool.fenceGate(ModBlocks.ETHERIAM_FENCE_GATE);
        blockStateModelGenerator.registerDoor(ModBlocks.ETHERIAM_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.ETHERIAM_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TOMATO_SAUCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROTTEN_TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.LETTUCE, Models.GENERATED);
    }
}
