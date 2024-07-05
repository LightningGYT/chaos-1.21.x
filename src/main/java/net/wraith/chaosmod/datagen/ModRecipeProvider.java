package net.wraith.chaosmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.wraith.chaosmod.block.ModBlocks;
import net.wraith.chaosmod.item.ModItems;
import net.wraith.chaosmod.util.ModTags;
import org.intellij.lang.annotations.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(
            ModBlocks.RUBY_ORE,
            ModBlocks.DEEPSLATE_RUBY_ORE
    );

    private static final List<ItemConvertible> ETHERIAM_PLANKS = List.of(
            ModBlocks.ETHERIAM_LOG,
            ModBlocks.ETHERIAM_WOOD
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


        offerBarkBlockRecipe(exporter, ModBlocks.ETHERIAM_WOOD, ModBlocks.ETHERIAM_LOG);

        offerPlanksRecipe(exporter, ModBlocks.ETHERIAM_PLANK, ModTags.Items.ETHERIAM_LOGS, 4);


    }
}
