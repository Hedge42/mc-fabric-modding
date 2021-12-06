package net.neato.scripts.mixin;

import net.minecraft.client.MinecraftClient;
import net.neato.scripts.Start;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class ClientMixin
{

    /*@Inject(at = @At("HEAD"), method = "<init>()V")
    // v for void //https://github.com/SpongePowered/Mixin/wiki/Injection-Point-Reference#description-7
    private void init(CallbackInfo info) {
        Start.LOGGER.info("Client init");
    }*/

    // private String getWindowTitle() {
    // https://jenkins.liteloader.com/job/Mixin/javadoc/index.html?org/spongepowered/asm/mixin/injection/struct/MemberInfo.html
    //@Inject(at = @At(value = "HEAD"), method = "net.minecraft.client.MinecraftClient.getWindowTitle")
    @Inject(at = @At(value = "HEAD"), method = "net.minecraft.client.MinecraftClient.getWindowTitle()Ljava/lang/String;")
    protected void getWindowTitle(CallbackInfoReturnable info)
    {
        var ret = info.getReturnValue(); // null sometimes
        var str = ret == null ? "null" : ret.toString();

        Start.LOGGER.info("Window title: " + str);
    }
}
