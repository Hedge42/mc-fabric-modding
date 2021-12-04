package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.MinecartItem;
import net.minecraft.util.ModStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.border.TitledBorder;

public class ExampleMod implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "neato";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    private MinecraftClient instance;
    private ModStatus status;
    private ClientPlayerEntity player;

    @Override
    public void onInitialize() {

        //this.instance = MinecraftClient.getInstance();
        //this.status = MinecraftClient.getModStatus();
        //this.player = instance.player;

        ModItems.registerItems();
    }

}
