package net.wraith.chaosmod.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.wraith.chaosmod.ChaosMod;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ModArmorMaterial {

    public static final RegistryEntry<ArmorMaterial> ETHEREAL = registerMaterial(
            "ethereal",
            Map.of(
                    ArmorItem.Type.HELMET, 3,
                    ArmorItem.Type.LEGGINGS, 6,
                    ArmorItem.Type.CHESTPLATE, 8,
                    ArmorItem.Type.BOOTS, 3,
                    ArmorItem.Type.BODY, 11
            ),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(EtherealItems.ETHEREAL_INGOT),
            0.0f,
            0.2f,
            false
    );

    public static @NotNull RegistryEntry<ArmorMaterial> registerMaterial(String name, Map<ArmorItem.Type, Integer> defensePoints, int enchantability,
                                                                         RegistryEntry<SoundEvent> equipSound, Supplier<Ingredient> repairIngredient,
                                                                         float toughness, float knockbackResistance, boolean dyeble) {
        List<ArmorMaterial.Layer> layers = List.of(
                new ArmorMaterial.Layer(
                        Identifier.of(ChaosMod.MOD_ID, name),
                        "",
                        dyeble
                )
        );
        ArmorMaterial material = new ArmorMaterial(
                defensePoints,
                enchantability,
                equipSound,
                repairIngredient,
                layers,
                toughness,
                knockbackResistance
        );

        material = Registry.register(Registries.ARMOR_MATERIAL, Identifier.of(ChaosMod.MOD_ID, name), material);

        return RegistryEntry.of(material);
    }


    public static void initialize() {};
}
