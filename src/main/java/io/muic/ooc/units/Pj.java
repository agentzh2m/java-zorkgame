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
    }
}
