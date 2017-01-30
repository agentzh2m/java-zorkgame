package io.muic.ooc.weapon;

import io.muic.ooc.WeaponItem;

public class IPad extends WeaponItem{
    public IPad() {
        setName("Ipad");
        setDescription("An electronic weapon that you can slap people with");
        setAction("iSlap");
        setDamage(10);
        setAccuracy(80);
    }
}
