package net.wraith.chaosmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.wraith.chaosmod.block.EtheriamBlocks;
import net.wraith.chaosmod.block.ModBlocks;

public class ChaosModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(EtheriamBlocks.ETHERIAM_TRAPDOOR, RenderLayer.getCutout()); // Fuck this shit
        BlockRenderLayerMap.INSTANCE.putBlock(EtheriamBlocks.ETHERIAM_DOOR, RenderLayer.getCutout());
    }
}
