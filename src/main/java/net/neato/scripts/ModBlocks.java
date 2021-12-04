package net.neato.scripts;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
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
        // var fields = ModBlocks.class.getFields();


        Registry.register(Registry.BLOCK, new Identifier(ExampleMod.MOD_ID, "ruby_block"), RUBY_BLOCK);

        ExampleMod.LOGGER.info("Registered blocks!");
    }
}
