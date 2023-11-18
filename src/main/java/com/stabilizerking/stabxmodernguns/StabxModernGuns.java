package com.stabilizerking.stabxmodernguns;

import com.mrcrayfish.guns.item.GunItem;
import com.stabilizerking.stabxmodernguns.client.ClientHandler;
import com.stabilizerking.stabxmodernguns.registeration.ModCreativeModeTabRegisteration;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;
import com.stabilizerking.stabxmodernguns.registeration.ModSoundRegisteration;
import com.stabilizerking.stabxmodernguns.utils.StabxModUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

@Mod(StabxModernGuns.MOD_ID)
public class StabxModernGuns {
    public static final String MOD_ID = "stabxmodernguns";
    private static final Logger LOGGER = LogManager.getLogger();

    public StabxModernGuns() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.register(this);

        ModItemRegisteration.ITEMS.register(modEventBus);
        ModSoundRegisteration.SOUNDS.register(modEventBus);
        ModCreativeModeTabRegisteration.register(modEventBus);


        modEventBus.addListener(this::addCreative);
        modEventBus.addListener(this::clientSetup);

    }


    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        event.enqueueWork(ClientHandler::registerModelOverrides);
    }
}
