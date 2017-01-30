package io.muic.ooc;

import java.util.Random;

public class WeaponItem extends Item {

    private int accuracy;
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public float getAccuracy() {
        return accuracy/100;
    }

    public void setAccuracy(int accuracy) {
        if(accuracy > 100) this.accuracy = 100;
        else this.accuracy = accuracy;
    }

    public int attack(){
        Random random = new Random();
        double prob = random.nextDouble();
        if(prob <= getAccuracy()) return getDamage();
        else return 0;
    }
}
