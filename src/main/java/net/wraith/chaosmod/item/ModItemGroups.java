package net.wraith.chaosmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.wraith.chaosmod.ChaosMod;

public class ModItemGroups {
    public static final ItemGroup CHAOS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ChaosMod.MOD_ID, "chaos"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chaos"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                    }).build());

    public static void registerItemGroups() {
        ChaosMod.LOGGER.info("Register Item Groups for " + ChaosMod.MOD_ID);
    }
}
