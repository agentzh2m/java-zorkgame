package io.muic.ooc.potion;

import io.muic.ooc.ConsumableItem;

public class CokeLight extends ConsumableItem {
    public CokeLight() {
        setName("Coke Light");
        setDescription("A non fat drink");
        setAction("drink");
        setHeal(5);
    }
}
