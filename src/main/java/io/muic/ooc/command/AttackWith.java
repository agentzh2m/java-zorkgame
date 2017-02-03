package io.muic.ooc.command;

import io.muic.ooc.*;

import java.util.Iterator;
import java.util.List;

public class AttackWith implements Command{
    public void apply(String weaponItem){
        List<Item> playerItem = Player.getInstance().getItems();
        if(GameMap.getInstance().getCurrentRoom().getUnits().size() == 0){
            System.out.println("There are no monster that you can attack");
            return;
        }
        Unit currentMonster = GameMap.getInstance().getCurrentRoom().getUnits().get(0);
        WeaponItem playerWeapon = null;
        for(Iterator<Item> itm = playerItem.iterator(); itm.hasNext();){
            Item curItem = itm.next();
            if(curItem.getName().equals(weaponItem) && curItem.getClass().getName().contains("weapon")){
                playerWeapon = (WeaponItem) curItem;
            }
        }
        if(playerWeapon != null){
            Player.getInstance().attack(playerWeapon, currentMonster);
            if(Player.getInstance().isDead()){
                System.out.println("You are dead respawn at half health at starting location");
                GameMap.getInstance().respawn();
            }
            currentMonster.attack(Player.getInstance());
            if(currentMonster.isDead()){
                System.out.println("Successfully kill " + currentMonster.getName());
                GameMap.getInstance().getCurrentRoom().removeUnit(currentMonster);
                currentMonster.dropItem();
            }
            Player.getInstance().isDead();
        }else {
            System.out.println("You don't have this weapon or invalid weapon name");
        }
    }
}
