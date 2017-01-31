package io.muic.ooc.potion;

import io.muic.ooc.ConsumableItem;
import io.muic.ooc.Player;

public class Coke extends ConsumableItem{
    public Coke() {
        setName("Coke");
        setDescription("Normal coke but if you drink coke zero previously +40 HP");
        setHeal(10);
        setAction("drink");
    }

    @Override
    public void use(Player player) {
        if(player.getLatestItem().getName().equals("Coke Zero"))player.increaseHealth(40);
        else super.use(player);
    }
}
