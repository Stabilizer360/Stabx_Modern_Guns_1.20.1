package com.stabilizerking.stabxmodernguns.registeration;

import com.stabilizerking.stabxmodernguns.utils.StabxModUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import com.stabilizerking.stabxmodernguns.StabxModernGuns;
import net.minecraftforge.registries.RegistryObject;

//Author Stabilizer King
public class ModCreativeModeTabRegisteration {

    //Now this will be gonna big ass java class which will be registering all the gun items and in the creative tabs  in the mod
    //In the 1.20.1 we will now register the Creative tabs as a stupid block which the code becomes very easy to understand
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB , StabxModernGuns.MOD_ID);



//------------------------------------------------------------Pistols-----------------------------------------------------------------------------------------//


    //Now How there is goes we will register each creative tab as a registry object
    public static final RegistryObject<CreativeModeTab> PISTOLS = CREATIVE_MODE_TABS.register("stabxmodernguns",

            //Now we will apply "gun without bar" method on creative tab icon  which to hide the black ammo capacity bar
            () -> CreativeModeTab.builder().icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.GLOCK_19_C.get()))
                    .title(Component.translatable("creativetab.stabxmodernguns"))
                    .displayItems((pParameters, event) -> {
                        //Now same behavior applies on every gun big thanks to chatgpt
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.GLOCK_19_C.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.DESERT_EAGLE_MARK_14.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.COLT_M1911A1.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.BAREETA67.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.P226.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.HKUSP45.get()));
                    })
                    .build());


//------------------------------------------------------------SMGs-----------------------------------------------------------------------------------------//

    //Once again we will apply the same behavior in every creative tabs  this will prevent the game from lagging when opening a creative menu
    public static final RegistryObject<CreativeModeTab> SMGs = CREATIVE_MODE_TABS.register("smgs",
            () -> CreativeModeTab.builder().icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.MP5_CLASSIC.get()))
                    .title(Component.translatable("creativetab.smgs"))
                    .displayItems((pParameters, event) -> {
                        //Now same behavior applies on every gun
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.MP5_CLASSIC.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.STRIKER45.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.MP40.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.TEC9.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.ZXR_MP7.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.VECTOR45.get()));
                    })
                    .build());

//------------------------------------------------------------Assault Rifles-----------------------------------------------------------------------------------------//

    public static final RegistryObject<CreativeModeTab> ASSAULT_RIFLES = CREATIVE_MODE_TABS.register("assault_rifles",
            () -> CreativeModeTab.builder().icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.AK_47.get()))
                    .title(Component.translatable("creativetab.assault_rifles"))
                    .displayItems((pParameters, event) -> {
                        //Now same behavior applies on every gun
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.AK_47.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.MODERN_GK57.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.RATNIK19.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.M4.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.HK416.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.MK_MOD11.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.SCAR_17.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.AKS_74.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.AK_103.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.AKM_762.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.AKS_74_UX.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.STG44.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.M16.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.M4A1.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.G36C_HD.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.ACR_BUSHMASTER.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.SCAR17_HD.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.AUG556.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.FAMAS_G7.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.MCX_HONEYBADGER.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.NZ41.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.AZ67.get()));
                    })
                    .build());

//------------------------------------------------------------Shotguns-----------------------------------------------------------------------------------------//

    public static final RegistryObject<CreativeModeTab> SHOTGUNS = CREATIVE_MODE_TABS.register("shotguns",
            () -> CreativeModeTab.builder().icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.BENELLI_M4.get()))
                    .title(Component.translatable("creativetab.shotguns"))
                    .displayItems((pParameters, event) -> {
                        //Now same behavior applies on every gun
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.AA_12UX.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.SPAS_12.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.MOSSBERG_500.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.SUPER_SHORTY.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.BENELLI_M4.get()));
                    })
                    .build());

//------------------------------------------------------------Rifles-----------------------------------------------------------------------------------------//

    public static final RegistryObject<CreativeModeTab> RIFLES = CREATIVE_MODE_TABS.register("rifles",
            () -> CreativeModeTab.builder().icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.KAR98K.get()))
                    .title(Component.translatable("creativetab.rifles"))
                    .displayItems((pParameters, event) -> {
                        //Now same behavior applies on every gun
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.ARISAKA_TYPE_99.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.M1_GRANDE.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.M1_GARAND_REMAKE.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.KAR98K.get()));
                    })
                    .build());


//------------------------------------------------------------Marksman Rifle DMRs-----------------------------------------------------------------------------------------//

    public static final RegistryObject<CreativeModeTab> DMRS = CREATIVE_MODE_TABS.register("dmrs",
            () -> CreativeModeTab.builder().icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.M14.get()))
                    .title(Component.translatable("creativetab.dmrs"))
                    .displayItems((pParameters, event) -> {
                        //Now same behavior applies on every gun
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.M14.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.SKS.get()));
                    })
                    .build());

//------------------------------------------------------------Marksman Rifle DMRs-----------------------------------------------------------------------------------------//

    public static final RegistryObject<CreativeModeTab> SNIPER_RIFLES = CREATIVE_MODE_TABS.register("sniper_rifles",
            () -> CreativeModeTab.builder().icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.ARTIC_WARFARE_MAGNUM.get()))
                    .title(Component.translatable("creativetab.sniper_rifles"))
                    .displayItems((pParameters, event) -> {
                        //Now same behavior applies on every gun
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.ARTIC_WARFARE_MAGNUM.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.SPR_3608.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.REMINGTON360.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.DRAGNAOV_SVD.get()));
                    })
                    .build());

//------------------------------------------------------------Marksman Rifle DMRs-----------------------------------------------------------------------------------------//

    public static final RegistryObject<CreativeModeTab> LMGS = CREATIVE_MODE_TABS.register("lmgs",
            () -> CreativeModeTab.builder().icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.RPK.get()))
                    .title(Component.translatable("creativetab.lmgs"))
                    .displayItems((pParameters, event) -> {
                        //Now same behavior applies on every gun
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.M60.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.RPK.get()));
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.BRUEN_MK9.get()));
                    })
                    .build());

    //------------------------------------------------------------Marksman Rifle DMRs-----------------------------------------------------------------------------------------//

    public static final RegistryObject<CreativeModeTab> MISCELLANEAUS = CREATIVE_MODE_TABS.register("miscellaneous",
            () -> CreativeModeTab.builder().icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.MK_170_CROSSBOW.get()))
                    .title(Component.translatable("creativetab.miscellaneous"))
                    .displayItems((pParameters, event) -> {
                        //Now same behavior applies on every gun
                        event.accept(StabxModUtils.gunWithoutBar(ModItemRegisteration.MK_170_CROSSBOW.get()));
                    })
                    .build());

    //------------------------------------------------------------Attachments-----------------------------------------------------------------------------------------//


    public static final RegistryObject<CreativeModeTab> ATTACHMENTS = CREATIVE_MODE_TABS.register("attachments_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItemRegisteration.RED_DOT_SIGHT.get()))
                    .title(Component.translatable("creativetab.attachments_tab"))
                    .displayItems((pParameters, event) -> {
                        event.accept(ModItemRegisteration.RED_DOT_SIGHT.get());
                        event.accept(ModItemRegisteration.HOLOGRAPHIC_SIGHT.get());
                        event.accept(ModItemRegisteration.ZA_MINI_RED_DOT_SIGHT.get());
                        event.accept(ModItemRegisteration.ACOG_SIGHT.get());
                        event.accept(ModItemRegisteration.SIMPLE_SNIPER_SCOPE.get());
                        event.accept(ModItemRegisteration.HOLOGRAPHIC_SIGHT.get());
                        event.accept(ModItemRegisteration.KOBRA_SIGHT.get());
                        event.accept(ModItemRegisteration.MINI_SIGHT.get());
                        event.accept(ModItemRegisteration.CUSTOM_STOCK.get());
                        event.accept(ModItemRegisteration.ADVANCED_SUPPRESSOR.get());
                        event.accept(ModItemRegisteration.ADVANCED_MUZZLE_BRAKE.get());
                        event.accept(ModItemRegisteration.ANGLED_FOREGRIP.get());
                        event.accept(ModItemRegisteration.VERTICAL_FOREGRIP.get());
                        event.accept(ModItemRegisteration.SKELETON_FOREGRIP.get());
                    })
                    .build());

    //------------------------------------------------------------Ammunition-----------------------------------------------------------------------------------------//


    public static final RegistryObject<CreativeModeTab> AMMUNITION = CREATIVE_MODE_TABS.register("ammunition_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItemRegisteration.NINE_MM.get()))
                    .title(Component.translatable("creativetab.ammunition_tab"))
                    .displayItems((pParameters, event) -> {
                        event.accept(ModItemRegisteration.NINE_MM.get());
                        event.accept(ModItemRegisteration.SEVEN_62_MM.get());
                        event.accept(ModItemRegisteration.FOUR_6_X_30MM.get());
                        event.accept(ModItemRegisteration.T303_BRITISH.get());
                        event.accept(ModItemRegisteration.SEVEN_92_X_57MM.get());
                        event.accept(ModItemRegisteration.THREE_300_BLACKOUT.get());
                        event.accept(ModItemRegisteration.TWELVE_GAUGE_BUCKSHOT_SLUG_SHELL.get());
                        event.accept(ModItemRegisteration.FIVE_56_X_45_NATO.get());
                        event.accept(ModItemRegisteration.FIVE_45_X_39MM.get());
                        event.accept(ModItemRegisteration.SEVEN_7_X_58_MM.get());
                        event.accept(ModItemRegisteration.SEVEN_32_X_33_MM_KURZ.get());
                        event.accept(ModItemRegisteration.FIFTY_CALIBER.get());
                        event.accept(ModItemRegisteration.THREE_HUNDRED_WM.get());
                        event.accept(ModItemRegisteration.FOURTY_FIVE_ACP.get());
                        event.accept(ModItemRegisteration.SEVEN_32_X_51_MM_NATO.get());
                        event.accept(ModItemRegisteration.FIFTY_AE.get());
                        event.accept(ModItemRegisteration.FIFTY_BMG.get());
                        event.accept(ModItemRegisteration.THRITY_SIXTY_AMMO.get());
                        event.accept(ModItemRegisteration.MK_CROSSBOW_ARROW.get());
                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}