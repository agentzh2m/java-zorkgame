package io.muic.ooc.units;

import io.muic.ooc.Boss;
import io.muic.ooc.Item;


public class Pj extends Boss {

    @Override
    public Item dropItem() {
        return null;
    }

    public Pj() {
        setName("Pankaj Ahuja (PJ)");
        setAttackScore(10);
        setHealth(101);
    }

    /**
     * The resurrection skill for PJ
     * @param health
     */
    @Override
    public void decreaseHealth(int health) {
        if(getHealth() - health <= 0){
            super.decreaseHealth(health);
            if(random.nextDouble() <= 0.5){
                System.out.println("PJ Never dies!!!");
                super.increaseHealth(super.getMaxHealth()/2);
            }
        }else{
            super.decreaseHealth(health);
        }
    }
}
