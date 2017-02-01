package io.muic.ooc;

import java.util.Random;

public abstract class Boss extends Unit {
    private final double ATTACK_CHANCE = 0.6;
    private final double ATTACK_REDUCE = 0.9;
    @Override
    public void attack(Player player) {
        if(random.nextDouble() < ATTACK_CHANCE){
            player.decreaseHealth((int) (super.getAttackScore() * ATTACK_REDUCE));
        }else{
            player.decreaseHealth(super.getAttackScore());
        }
    }

}
