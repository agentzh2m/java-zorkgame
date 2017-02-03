package io.muic.ooc.units;

import io.muic.ooc.*;

public class Johny extends Boss {
    public Johny() {
        setHealth(100);
        setAttackScore(10);
        setName("Johny");
        setExp(10);
    }

    @Override
    public Item dropItem() {
        return ItemFactory.randomWeapon();
    }

    @Override
    public boolean isDead() {
        boolean bossyIsDead = true;
        for(Room room: GameMap.getInstance().getRooms()){
            for(Unit u: room.getUnits()){
                if(u.getName().equals("Bossy")) {
                    bossyIsDead = false;
                    break;
                }
            }
        }
        if(bossyIsDead) GameMap.getInstance().loadLevelThree();
        return super.isDead();
    }
}
