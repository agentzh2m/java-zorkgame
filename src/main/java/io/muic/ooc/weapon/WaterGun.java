package io.muic.ooc.weapon;

import io.muic.ooc.WeaponItem;

import java.util.Random;

public class WaterGun extends WeaponItem{
    public WaterGun() {
        setName("Water Gun");
        setDescription("It does not hurt but it is annoying have a 65% chance to add an extra 4 damage");
        setAction("shoot");
        setDamage(1);
        setAccuracy(100);
    }

    @Override
    public int attack() {
        Random random = new Random();
        int totalAttack = 0;
        double prob = random.nextDouble();
        if(prob <= getAccuracy()) totalAttack+=getDamage();
        prob = random.nextDouble();
        if(prob <= 0.65) {
            System.out.println("Look like the water is contaminated +3 damage");
            totalAttack+= 3;
        }
        return totalAttack;
    }
}
