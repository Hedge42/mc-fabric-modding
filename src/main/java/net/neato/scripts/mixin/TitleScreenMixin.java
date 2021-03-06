package net.neato.scripts.mixin;

import net.neato.scripts.Start;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    // v for void //https://github.com/SpongePowered/Mixin/wiki/Injection-Point-Reference#description-7
    private void init(CallbackInfo info) {
        Start.LOGGER.info("Title screen init...");
    }
}
