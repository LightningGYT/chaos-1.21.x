package net.wraith.chaosmod.item;

import net.minecraft.component.type.FoodComponent;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {


    // Tomatoes
    public static final FoodComponent TOMATO = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0)
            .snack()
            .build();

    public static final FoodComponent TOMATO_SAUCE = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(6.0f)
            .build();

    public static final FoodComponent ROTTEN_TOMATO = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 5), 0.6f)
            .build();
}
