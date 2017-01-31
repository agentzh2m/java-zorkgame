package io.muic.ooc;

import io.muic.ooc.potion.*;
import io.muic.ooc.weapon.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemFactory {
    public final static List<String> allPotions =
            new ArrayList<>(Arrays.asList("coke", "coke-light", "coke-zero", "namthip"));
    public final static List<String> allWeapons =
            new ArrayList<>(Arrays.asList("ipad", "note7", "stapler-gun", "water-gun", "white-board-marker"));

    public static ConsumableItem getPotion(String potion){
        switch (potion){
            case "coke": return new Coke();
            case "coke-light": return new CokeLight();
            case "coke-zero": return new CokeZero();
            case "namthip": return new NamthipWater();
            default:
                System.err.println("Invalid potion");
                return null;
        }
    }

    public static List<ConsumableItem> getAllPotion(){
        List<ConsumableItem> potions = new ArrayList<>();
        for(String potion: allPotions)
            potions.add(getPotion(potion));
        return potions;
    }

    public static WeaponItem getWeapon(String weapon){
        switch (weapon){
            case "ipad": return new IPad();
            case "note7": return new SamsungNote7();
            case "stapler-gun": return new StaplerGun();
            case "water-gun": return new WaterGun();
            case "white-board-marker": return new WhiteBoardMarker();
            default:
                System.err.println("Invalid weapon name");
                return null;

        }
    }

    public static List<WeaponItem> getAllWeapon(){
        List<WeaponItem> weapons = new ArrayList<>();
        for(String weapon: allWeapons)
            weapons.add(getWeapon(weapon));
        return weapons;
    }



}
