package net.wraith.chaosmod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.wraith.chaosmod.ChaosMod;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> ETHERIAM_LOGS =
                createTag("etheriam_logs");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ChaosMod.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> ETHERIAM_LOGS =
                createTag("etheriam_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ChaosMod.MOD_ID, name));
        }
    }

}
