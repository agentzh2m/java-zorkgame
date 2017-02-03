package io.muic.ooc.units;

import io.muic.ooc.Boss;
import io.muic.ooc.GameMap;
import io.muic.ooc.Item;
import io.muic.ooc.ItemFactory;


public class Pj extends Boss {

    @Override
    public void dropItem() {
        GameMap.getInstance().getCurrentRoom().addItem(ItemFactory.randomWeapon());
    }

    public Pj() {
        setName("Pankaj Ahuja (PJ)");
        setAttackScore(10);
        setHealth(101);
        setExp(20);
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

    @Override
    public boolean isDead() {
        boolean deadStatus = super.isDead();
        if(deadStatus){
            GameMap.getInstance().loadLevelTwo();
        }
        return deadStatus;
    }
}
