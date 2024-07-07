package net.wraith.chaosmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.wraith.chaosmod.block.EtheriamBlocks;
import net.wraith.chaosmod.block.ModBlocks;
import net.wraith.chaosmod.item.ModItems;
import net.wraith.chaosmod.util.ModTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(
            ModBlocks.RUBY_ORE,
            ModBlocks.DEEPSLATE_RUBY_ORE
    );

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // Ruby
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC,
                ModItems.RUBY, 0.7f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC,
                ModItems.RUBY, 0.7f, 100, "ruby");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);


        // Etheriam wood stuff
        offerBarkBlockRecipe(exporter, EtheriamBlocks.STRIPPED_ETHERIAM_WOOD, EtheriamBlocks.STRIPPED_ETHERIAM_LOG);
        offerBarkBlockRecipe(exporter, EtheriamBlocks.ETHERIAM_WOOD, EtheriamBlocks.ETHERIAM_LOG);
        offerPlanksRecipe(exporter, EtheriamBlocks.ETHERIAM_PLANK, ModTags.Items.ETHERIAM_LOGS, 4);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EtheriamBlocks.ETHERIAM_SLAB, EtheriamBlocks.ETHERIAM_PLANK);
        offerPressurePlateRecipe(exporter, EtheriamBlocks.ETHERIAM_PRESSURE_PLATE, EtheriamBlocks.ETHERIAM_PLANK);
        offerButtonRecipe(exporter, EtheriamBlocks.ETHERIAM_BUTTON, EtheriamBlocks.ETHERIAM_PLANK);
        offerStairsRecipe(exporter, EtheriamBlocks.ETHERIAM_STAIRS, EtheriamBlocks.ETHERIAM_PLANK);
        offerFenceRecipe(exporter, EtheriamBlocks.ETHERIAM_FENCE, EtheriamBlocks.ETHERIAM_PLANK);
        offerFenceGateRecipe(exporter, EtheriamBlocks.ETHERIAM_FENCE_GATE, EtheriamBlocks.ETHERIAM_PLANK);
        offerDoorRecipe(exporter, EtheriamBlocks.ETHERIAM_DOOR, EtheriamBlocks.ETHERIAM_PLANK);
        offerTrapdoorRecipe(exporter, EtheriamBlocks.ETHERIAM_TRAPDOOR, EtheriamBlocks.ETHERIAM_PLANK);



    }

    public static void offerButtonRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output)
                .input('#', input)
                .pattern("#")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerStairsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .input('#', input)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerFenceRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, 4)
                .input('#', input)
                .input('S', Items.STICK)
                .pattern("S#S")
                .pattern("S#S")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerFenceGateRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 4)
                .input('#', input)
                .input('S', Items.STICK)
                .pattern("#S#")
                .pattern("#S#")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerDoorRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 3)
                .input('#', input)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerTrapdoorRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 2)
                .input('#', input)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

}
