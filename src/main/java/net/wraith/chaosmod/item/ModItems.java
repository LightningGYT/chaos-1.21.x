package net.wraith.chaosmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wraith.chaosmod.ChaosMod;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ChaosMod.MOD_ID, name), item);
    };

    public static void registerModItems() {
        ChaosMod.LOGGER.info("Registering Mod Items for " + ChaosMod.MOD_ID);
    };
}
