package io.muic.ooc.units;

import io.muic.ooc.Boss;
import io.muic.ooc.Item;

public class Mj extends Boss {
    public Mj() {
        setName("Majeed (Mj)");
        setHealth(210);
        setExp(1000);
        setAttackScore(35);
    }

    @Override
    public Item dropItem() {
        System.out.println("You win the game made by Hamuel");
        System.out.println("Exiting in 3 seconds");
        try {
            Thread.sleep(3000);
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
