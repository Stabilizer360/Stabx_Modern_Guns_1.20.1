package com.stabilizerking.stabxmodernguns.registeration;

import com.stabilizerking.stabxmodernguns.StabxModernGuns;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabRegisteration {


    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB , StabxModernGuns.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ELITE_WARFARE_TAB = CREATIVE_MODE_TABS.register("elitewarfare_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get()))
                    .title(Component.translatable("creativetab.stabxmodernguns"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> SMGS = CREATIVE_MODE_TABS.register("smgs",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItemsRegistery.MAGNUM500.get()))
                    .title(Component.translatable("creativetab.stabx_ammunation"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}