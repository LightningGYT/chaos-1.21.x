package net.wraith.chaosmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.wraith.chaosmod.block.EtherealBlocks;
import net.wraith.chaosmod.block.EtheriamBlocks;
import net.wraith.chaosmod.block.ModBlocks;
import net.wraith.chaosmod.item.EtherealItems;
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
        blockStateModelGenerator.registerLog(EtheriamBlocks.ETHERIAM_LOG).log(EtheriamBlocks.ETHERIAM_LOG).wood(EtheriamBlocks.ETHERIAM_WOOD);
        blockStateModelGenerator.registerLog(EtheriamBlocks.STRIPPED_ETHERIAM_LOG).log(EtheriamBlocks.STRIPPED_ETHERIAM_LOG).wood(EtheriamBlocks.STRIPPED_ETHERIAM_WOOD);


        // Blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);

        // Etheriam Grass
        TextureMap textureMap = new TextureMap()
                .put(TextureKey.BOTTOM, TextureMap.getId(Blocks.END_STONE))
                .put(TextureKey.TOP, TextureMap.getId(EtheriamBlocks.ETHERIAM_GRASS_BLOCK))
                .put(TextureKey.SIDE, TextureMap.getSubId(EtheriamBlocks.ETHERIAM_GRASS_BLOCK, "_side"));
        blockStateModelGenerator.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(
                        EtheriamBlocks.ETHERIAM_GRASS_BLOCK,
                        BlockStateVariant.create()
                                .put(VariantSettings.MODEL, Models.CUBE_BOTTOM_TOP.upload(
                                        EtheriamBlocks.ETHERIAM_GRASS_BLOCK,
                                        textureMap,
                                        blockStateModelGenerator.modelCollector
                                ))
                ));



        // Etheriam Plank things
        BlockStateModelGenerator.BlockTexturePool etheriamPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EtheriamBlocks.ETHERIAM_PLANK);

        etheriamPlankPool.stairs(EtheriamBlocks.ETHERIAM_STAIRS);
        etheriamPlankPool.slab(EtheriamBlocks.ETHERIAM_SLAB);
        etheriamPlankPool.button(EtheriamBlocks.ETHERIAM_BUTTON);
        etheriamPlankPool.pressurePlate(EtheriamBlocks.ETHERIAM_PRESSURE_PLATE);
        etheriamPlankPool.fence(EtheriamBlocks.ETHERIAM_FENCE);
        etheriamPlankPool.fenceGate(EtheriamBlocks.ETHERIAM_FENCE_GATE);
        blockStateModelGenerator.registerDoor(EtheriamBlocks.ETHERIAM_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(EtheriamBlocks.ETHERIAM_TRAPDOOR);

        // Ethereal ore
        blockStateModelGenerator.registerSimpleCubeAll(EtherealBlocks.ETHEREAL_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TOMATO_SAUCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROTTEN_TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.LETTUCE, Models.GENERATED);
        itemModelGenerator.register(EtherealItems.ETHEREAL_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(EtherealItems.ETHEREAL_INGOT, Models.GENERATED);

        itemModelGenerator.register(EtherealItems.ETHEREAL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(EtherealItems.ETHEREAL_AXE, Models.HANDHELD);
        itemModelGenerator.register(EtherealItems.ETHEREAL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(EtherealItems.ETHEREAL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(EtherealItems.ETHEREAL_HOE, Models.HANDHELD);
    }
}
