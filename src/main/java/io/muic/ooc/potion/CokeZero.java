package io.muic.ooc.potion;

import io.muic.ooc.ConsumableItem;

public class CokeZero extends ConsumableItem{
    public CokeZero() {
        setName("Coke Zero");
        setDescription("Absolutely no fat best to drink with coke");
        setAction("drink");
        setHeal(2);
    }
}
