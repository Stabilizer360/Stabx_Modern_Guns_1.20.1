package com.stabilizerking.stabxmodernguns.utils;

import com.mrcrayfish.guns.item.GunItem;
import net.minecraft.world.item.ItemStack;

public class StabxModUtils {


    //In this Class we have the "Gun without bar" method which helps us to hide the stupid ass gun
    public static ItemStack gunWithoutBar(GunItem gun){
        ItemStack itemStack = new ItemStack(gun);
        itemStack.getOrCreateTag().putInt("AmmoCount", gun.getGun().getGeneral().getMaxAmmo());
        return itemStack;
    }
}