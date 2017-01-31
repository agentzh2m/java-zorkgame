package io.muic.ooc;

import java.util.Random;

public abstract class Boss extends Unit {
    @Override
    public void attack(Player player) {
        double prob = new Random().nextDouble();
        int dmg = 0;
        if(prob <= 0.25){
            dmg = (int) (getAttackScore()*0.8);
        }else if(prob > 0.25 && prob < 0.75){
            dmg = (int) (getAttackScore()*0.9);
        }else{
            dmg = getAttackScore();
        }
        player.decreaseHealth(dmg);
    }

}
