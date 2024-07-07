package net.wraith.chaosmod.item;

import net.minecraft.item.*;

import static net.wraith.chaosmod.item.ModItems.registerItem;

public class EtherealItems {

    public static final Item ETHEREAL_ESSENCE = registerItem("ethereal_essence",
            new Item(new Item.Settings().fireproof()));

    public static final Item ETHEREAL_INGOT = registerItem("ethereal_ingot",
            new Item(new Item.Settings().fireproof()));


    // Tools
    public static final Item ETHEREAL_PICKAXE = registerItem("ethereal_pickaxe",
            new PickaxeItem(ModToolMaterial.ETHEREAL, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.ETHEREAL, 1.0f, -2.8f))
                    .fireproof()));

    public static final Item ETHEREAL_SWORD = registerItem("ethereal_sword",
            new SwordItem(ModToolMaterial.ETHEREAL, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.ETHEREAL, 3, -2.4f))
                    .fireproof()));

    public static final Item ETHEREAL_AXE = registerItem("ethereal_axe",
            new AxeItem(ModToolMaterial.ETHEREAL, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.ETHEREAL, 5.0F, -3.0F))
                    .fireproof()));

    public static final Item ETHEREAL_SHOVEL = registerItem("ethereal_shovel",
            new ShovelItem(ModToolMaterial.ETHEREAL, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.ETHEREAL, 1.0F, -2.8F))
                    .fireproof()));

    public static final Item ETHEREAL_HOE = registerItem("ethereal_hoe",
            new HoeItem(ModToolMaterial.ETHEREAL, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ETHEREAL, -4.0F, 0.0F))
                    .fireproof()));


    // Armor
    public static final Item ETHEREAL_HELMET = registerItem("ethereal_helmet",
            new ArmorItem(ModArmorMaterial.ETHEREAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .fireproof()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));

    public static final Item ETHEREAL_CHESTPLATE = registerItem("ethereal_chestplate",
            new ArmorItem(ModArmorMaterial.ETHEREAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .fireproof()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));

    public static final Item ETHEREAL_LEGGINGS = registerItem("ethereal_leggings",
            new ArmorItem(ModArmorMaterial.ETHEREAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .fireproof()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));

    public static final Item ETHEREAL_BOOTS = registerItem("ethereal_boots",
            new ArmorItem(ModArmorMaterial.ETHEREAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .fireproof()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));

    public static void registerEthereal() {

    }
}
