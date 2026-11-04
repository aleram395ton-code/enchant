package com.enchant;

import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CustomEnchantsMod implements ModInitializer {
    public static final String MOD_ID = "enchant";

    // Создаем зачарования
    public static final Enchantment SCARABS_GRACE = Registry.register(
        Registries.ENCHANTMENT,
        new Identifier(MOD_ID, "scarabs_grace"),
        new Enchantment(Enchantment.Rarity.RARE, EnchantmentTarget.ARMOR_FEET, new EquipmentSlot[]{EquipmentSlot.FEET}) {}
    );

    public static final Enchantment BANE_OF_LIVING = Registry.register(
        Registries.ENCHANTMENT,
        new Identifier(MOD_ID, "bane_of_living"),
        new Enchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND}) {}
    );

    public static final Enchantment TYPHOON = Registry.register(
        Registries.ENCHANTMENT,
        new Identifier(MOD_ID, "typhoon"),
        new Enchantment(Enchantment.Rarity.RARE, EnchantmentTarget.TRIDENT, new EquipmentSlot[]{EquipmentSlot.MAINHAND}) {}
    );

    @Override
    public void onInitialize() {
        System.out.println("Custom Enchants Mod initialized successfully!");
    }
}
