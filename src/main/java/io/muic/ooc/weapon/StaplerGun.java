package io.muic.ooc.weapon;

import io.muic.ooc.WeaponItem;

public class StaplerGun extends WeaponItem {
    public StaplerGun() {
        setName("Stapler Gun");
        setDescription("A weapon that is used to pin wall but it can hurt people too");
        setAction("shoot");
        setDamage(5);
        setAccuracy(95);
    }
}
