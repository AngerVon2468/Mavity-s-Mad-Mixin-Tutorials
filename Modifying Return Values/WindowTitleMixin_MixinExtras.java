// Mapped for Fabric's Yarn mappings (1.20.1), use https://linkie.shedaniel.dev/mappings to translate to other mappings.
package com.example.examplemod.mixin;

import net.minecraft.client.MinecraftClient;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;

@Mixin(MinecraftClient.class)
public class WindowTitleMixin_MixinExtras {

    @ModifyReturnValue(method = "getWindowTitle", at = @At(value = "RETURN"))
    public String getWindowTitle(String original) {
        return "Yahaha :3";
    }
}
