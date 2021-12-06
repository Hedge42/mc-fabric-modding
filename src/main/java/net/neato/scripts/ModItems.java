package net.neato.scripts;

import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

// https://www.youtube.com/watch?v=mzAoh2jPIpM
public class ModItems
{
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TRAIN_ENGINE = new Item(new Item.Settings().group(ItemGroup.TRANSPORTATION));

    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings()
            .group(ItemGroup.BUILDING_BLOCKS)
    );

    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier(Start.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Start.MOD_ID, "train_engine"), TRAIN_ENGINE);
        Registry.register(Registry.ITEM, new Identifier(Start.MOD_ID, "ruby_block"), RUBY_BLOCK);


        Start.LOGGER.info("Registered items!");
    }
}
