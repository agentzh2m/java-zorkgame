package io.muic.ooc.units;

import io.muic.ooc.*;

public class PossessedIce extends Boss {
    public PossessedIce() {
        setName("Possessed Ice");
        setHealth(150);
        setExp(100);
        setAttackScore(20);
    }

    @Override
    public Item dropItem() {
        Room[] rooms = GameMap.getInstance().getRooms();
        int[] corners = {9, 90, 99};
        //add boss to a random corner
        int randomCornerIndex = random.nextInt(corners.length);
        rooms[randomCornerIndex].addUnits(new Mj());
        System.out.println("Mj appear at room " + randomCornerIndex);
        return ItemFactory.randomWeapon();
    }
}
