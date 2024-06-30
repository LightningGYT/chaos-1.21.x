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


    // Add Items to Creative Inventory
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
    }

    // Add Items Method
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ChaosMod.MOD_ID, name), item);
    };

    public static void registerModItems() {
        ChaosMod.LOGGER.info("Registering Mod Items for " + ChaosMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    };
}
