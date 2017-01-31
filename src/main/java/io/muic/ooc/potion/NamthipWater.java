package io.muic.ooc.potion;

import io.muic.ooc.ConsumableItem;
import io.muic.ooc.Player;

import java.util.Random;

public class NamthipWater extends ConsumableItem{
    public NamthipWater() {
        setName("Namthip Water");
        setAction("drink");
        setDescription("Potion +20HP have a 5% chance to die and 50% chance to regenerate to full health");
        setHeal(20);
    }

    @Override
    public void use(Player player) {
        Random random = new Random();
        double prob = random.nextDouble();
        if(prob <= 0.05) {
            player.decreaseHealth(player.getHealth());
            System.out.println("The Namthip Water is contaminated you are dead!");
        }
        else if(prob > 0.05 && prob < 0.55 ) {
            player.increaseHealth(player.getHealth());
            System.out.println("You have drink the holy water wow so much power");
        }
        else super.use(player);
    }
}
