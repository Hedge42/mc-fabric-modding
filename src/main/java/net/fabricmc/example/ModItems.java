package net.fabricmc.example;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

// https://www.youtube.com/watch?v=mzAoh2jPIpM
public class ModItems
{
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TRAIN_ENGINE = new Item(new Item.Settings().group(ItemGroup.TRANSPORTATION));

    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier(ExampleMod.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(ExampleMod.MOD_ID, "train_engine"), TRAIN_ENGINE);

        ExampleMod.LOGGER.info("Registered items!");
    }
}
