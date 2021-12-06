package net.neato.scripts;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.fabricmc.fabric.api.renderer.v1.model.FabricBakedModel;
import net.fabricmc.fabric.impl.object.builder.FabricBlockInternals;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.MinecraftClient;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks
{
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByHand(false)
            .requiresTool()
            .strength(5.0f, 30.0f)
            //.hardness(5.0f)
            //.resistance(30f)
            .sounds(BlockSoundGroup.METAL)
        );

    public static void registerBlocks()
    {
        Registry.register(Registry.BLOCK, new Identifier(Start.MOD_ID, "ruby_block"), RUBY_BLOCK);

        Start.LOGGER.info("Registered blocks!");
    }
}
