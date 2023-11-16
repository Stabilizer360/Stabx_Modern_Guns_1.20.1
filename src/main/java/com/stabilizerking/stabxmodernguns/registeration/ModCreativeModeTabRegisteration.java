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

    public static final RegistryObject<CreativeModeTab> PISTOLS = CREATIVE_MODE_TABS.register("stabxmodernguns_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get()))
                    .title(Component.translatable("creativetab.stabxmodernguns_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get());
                        pOutput.accept(ModItemRegisteration.GLOCK_19_C.get());
                        pOutput.accept(ModItemRegisteration.DESERT_EAGLE_MARK_14.get());
                        pOutput.accept(ModItemRegisteration.COLT_M1911A1.get());
                        pOutput.accept(ModItemRegisteration.BAREETA67.get());
                        pOutput.accept(ModItemRegisteration.P226.get());
                        pOutput.accept(ModItemRegisteration.HKUSP45.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ATTACHMENTS = CREATIVE_MODE_TABS.register("attachments_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItemRegisteration.MP5_CLASSIC.get()))
                    .title(Component.translatable("creativetab.attachments_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItemRegisteration.RED_DOT_SIGHT.get());
                        pOutput.accept(ModItemRegisteration.HOLOGRAPHIC_SIGHT.get());
                        pOutput.accept(ModItemRegisteration.ZA_MINI_RED_DOT_SIGHT.get());
                        pOutput.accept(ModItemRegisteration.ACOG_SIGHT.get());
                        pOutput.accept(ModItemRegisteration.SIMPLE_SNIPER_SCOPE.get());
                        pOutput.accept(ModItemRegisteration.HOLOGRAPHIC_SIGHT.get());
                        pOutput.accept(ModItemRegisteration.KOBRA_SIGHT.get());
                        pOutput.accept(ModItemRegisteration.MINI_SIGHT.get());
                        pOutput.accept(ModItemRegisteration.CUSTOM_STOCK.get());
                        pOutput.accept(ModItemRegisteration.ADVANCED_SUPPRESSOR.get());
                        pOutput.accept(ModItemRegisteration.ADVANCED_MUZZLE_BRAKE.get());
                        pOutput.accept(ModItemRegisteration.ANGLED_FOREGRIP.get());
                        pOutput.accept(ModItemRegisteration.VERTICAL_FOREGRIP.get());
                        pOutput.accept(ModItemRegisteration.SKELETON_FOREGRIP.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> AMMUNITION = CREATIVE_MODE_TABS.register("ammunition_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItemRegisteration.NINE_MM.get()))
                    .title(Component.translatable("creativetab.ammunition_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItemRegisteration.NINE_MM.get());
                        pOutput.accept(ModItemRegisteration.SEVEN_62_MM.get());
                        pOutput.accept(ModItemRegisteration.FOUR_6_X_30MM.get());
                        pOutput.accept(ModItemRegisteration.T303_BRITISH.get());
                        pOutput.accept(ModItemRegisteration.SEVEN_92_X_57MM.get());
                        pOutput.accept(ModItemRegisteration.THREE_300_BLACKOUT.get());
                        pOutput.accept(ModItemRegisteration.TWELVE_GAUGE_BUCKSHOT_SLUG_SHELL.get());
                        pOutput.accept(ModItemRegisteration.FIVE_56_X_45_NATO.get());
                        pOutput.accept(ModItemRegisteration.FIVE_45_X_39MM.get());
                        pOutput.accept(ModItemRegisteration.SEVEN_7_X_58_MM.get());
                        pOutput.accept(ModItemRegisteration.SEVEN_32_X_33_MM_KURZ.get());
                        pOutput.accept(ModItemRegisteration.FIFTY_CALIBER.get());
                        pOutput.accept(ModItemRegisteration.THREE_HUNDRED_WM.get());
                        pOutput.accept(ModItemRegisteration.FOURTY_FIVE_ACP.get());
                        pOutput.accept(ModItemRegisteration.SEVEN_32_X_51_MM_NATO.get());
                        pOutput.accept(ModItemRegisteration.FIFTY_AE.get());
                        pOutput.accept(ModItemRegisteration.FIFTY_BMG.get());
                        pOutput.accept(ModItemRegisteration.THRITY_SIXTY_AMMO.get());
                        pOutput.accept(ModItemRegisteration.MK_CROSSBOW_ARROW.get());
                    })
                    .build());


    public static final RegistryObject<CreativeModeTab> SMGS = CREATIVE_MODE_TABS.register("smgs",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItemRegisteration.MP5_CLASSIC.get()))
                    .title(Component.translatable("creativetab.smgs"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItemRegisteration.MP5_CLASSIC.get());
                        pOutput.accept(ModItemRegisteration.ZXR_MP7.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}