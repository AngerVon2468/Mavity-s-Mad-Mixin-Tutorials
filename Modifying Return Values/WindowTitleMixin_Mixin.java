// Mapped for Fabric's Yarn mappings (1.20.1), use https://linkie.shedaniel.dev/mappings to translate to other mappings.
package com.example.examplemod.mixin;

import net.minecraft.client.MinecraftClient;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class WindowTitleMixin_Mixin {

    @Inject(method = "getWindowTitle", at = @At("RETURN"), cancellable = true)
    public void getWindowTitle(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("Yahaha :3");
    }
}
