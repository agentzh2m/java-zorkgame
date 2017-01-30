package io.muic.ooc.weapon;

import io.muic.ooc.WeaponItem;

import java.util.Random;

public class WhiteBoardMarker extends WeaponItem{
    public WhiteBoardMarker(){
        setName("White Board Marker");
        setDescription("A marker that is smelly has the 50% chance to add an extra 5 damage attack");
        setAction("iSlap");
        setDamage(2);
        setAccuracy(100);
    }

    @Override
    public int attack() {
        Random random = new Random();
        int totalAttack = 0;
        double prob = random.nextDouble();
        if(prob <= getAccuracy()) totalAttack+=getDamage();
        prob = random.nextDouble();
        if(prob <= 0.5) {
            System.out.println("the smelliness is too real!! +5 damage");
            totalAttack+= 5;
        }
        return totalAttack;
    }
}
