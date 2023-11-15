package com.stabilizerking.stabxmodernguns.registeration;

import com.mrcrayfish.guns.client.CustomGunManager;
import com.mrcrayfish.guns.enchantment.EnchantmentTypes;
import com.mrcrayfish.guns.init.ModItems;
import com.mrcrayfish.guns.item.GunItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Iterator;
import java.util.Objects;

public class RegisterCreativetab {
    public static void registerCreativeTab(IEventBus bus) {
        DeferredRegister<CreativeModeTab> register = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "cgm");
        CreativeModeTab.Builder builder = CreativeModeTab.builder();
        builder.title(Component.translatable("itemGroup.cgm"));
        builder.icon(() -> {
            ItemStack stack = new ItemStack((ItemLike) ModItems.PISTOL.get());
            stack.getOrCreateTag().putBoolean("IgnoreAmmo", true);
            return stack;
        });
        builder.displayItems((flags, output) -> {
            ModItems.REGISTER.getEntries().forEach((registryObject) -> {
                Object patt8856$temp = registryObject.get();
                if (patt8856$temp instanceof GunItem item) {
                    ItemStack stack = new ItemStack(item);
                    stack.getOrCreateTag().putInt("AmmoCount", item.getGun().getGeneral().getMaxAmmo());
                    output.accept(stack);
                } else {
                    output.accept((ItemLike)registryObject.get());
                }
            });
        }
    }
}
