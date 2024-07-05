package net.wraith.chaosmod.util;


import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.wraith.chaosmod.block.EtheriamBlocks;

public class ModFuels {

    public static void registerModFuels() {
        FuelRegistry.INSTANCE.add(EtheriamBlocks.ETHERIAM_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EtheriamBlocks.ETHERIAM_SLAB, 300);
        FuelRegistry.INSTANCE.add(EtheriamBlocks.ETHERIAM_BUTTON, 100);
        FuelRegistry.INSTANCE.add(EtheriamBlocks.ETHERIAM_PRESSURE_PLATE, 300);
        FuelRegistry.INSTANCE.add(EtheriamBlocks.ETHERIAM_FENCE, 300);
        FuelRegistry.INSTANCE.add(EtheriamBlocks.ETHERIAM_FENCE_GATE, 300);
        FuelRegistry.INSTANCE.add(EtheriamBlocks.ETHERIAM_DOOR, 200);
        FuelRegistry.INSTANCE.add(EtheriamBlocks.ETHERIAM_TRAPDOOR, 300);
    }
}
