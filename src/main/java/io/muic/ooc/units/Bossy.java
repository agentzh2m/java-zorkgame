package io.muic.ooc.units;

import io.muic.ooc.*;

public class Bossy extends Boss {
    public Bossy() {
        setName("Bossy");
        setHealth(100);
        setAttackScore(10);
        setExp(25);
    }

    @Override
    public void dropItem() {
        GameMap.getInstance().getCurrentRoom().addItem(ItemFactory.randomWeapon());
    }

    @Override
    public void decreaseHealth(int health) {
        if(ZorkGame.random.nextDouble() <= 0.5) super.decreaseHealth(health);
        else{
            System.out.println("Miss due to hypnosis");
        }
    }

    @Override
    public boolean isDead() {
        boolean johnyIsDead = true;
        for(Room room: GameMap.getInstance().getRooms()){
            for(Unit u: room.getUnits()){
                if(u.getName().equals("Johny")) {
                    johnyIsDead = false;
                    break;
                }
            }
        }
        if(johnyIsDead) GameMap.getInstance().loadLevelThree();
        return super.isDead();
    }
}
