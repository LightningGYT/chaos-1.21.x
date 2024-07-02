package net.wraith.chaosmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wraith.chaosmod.ChaosMod;

public class ModItems {
    // Items
    public static final Item RUBY = registerItem("ruby",
            new Item(new Item.Settings()));

    // Food
    public static final Item TOMATO = registerItem("tomato",
            new Item(new Item.Settings().food(ModFoodComponents.TOMATO)));

    public static final Item ROTTEN_TOMATO = registerItem("rotten_tomato",
            new Item(new Item.Settings().food(ModFoodComponents.ROTTEN_TOMATO)));

    public static final Item TOMATO_SAUCE = registerItem("tomato_sauce",
            new Item(new Item.Settings().food(ModFoodComponents.TOMATO_SAUCE)));

    // Add Items Method
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ChaosMod.MOD_ID, name), item);
    };

    public static void registerModItems() {
        ChaosMod.LOGGER.info("Registering Mod Items for " + ChaosMod.MOD_ID);


    };
}
