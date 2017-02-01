package io.muic.ooc;

import java.util.Iterator;
import java.util.List;

public class Command {
    public static void info(){
        System.out.println(Player.getInstance().getInfo());
        System.out.println("you can go: " + GameMap.getInstance().getCurrentRoom().listDirection());
        System.out.println("item in the room: " + GameMap.getInstance().getCurrentRoom().listItems());
        System.out.println("monster in the room: " + GameMap.getInstance().getCurrentRoom().listUnits());
    }
    public static void take(String item){
        if(GameMap.getInstance().getCurrentRoom().getUnits().size() == 0){
            List<Item> roomItems = GameMap.getInstance().getCurrentRoom().getItems();
            Item takenItem = null;
            for(Iterator<Item> itm = roomItems.iterator(); itm.hasNext(); ){
                Item curItem = itm.next();
                if(curItem.getName().equals(item)) {
                    roomItems.remove(curItem);
                    takenItem = curItem;
                    break;
                }
            }
            if(takenItem == null) System.out.println("Cannot find the item you wanted");
            else {
                Player.getInstance().pickItem(takenItem);
                System.out.println("you have pick up " + takenItem.getName());
            }
        }else {
            System.out.println("You need to beat all the monster to pick up item!!");
        }

    }
    public static void drop(String item){
        List<Item> playerItem = Player.getInstance().getItems();
        Item droppingItem = null;
        for(Iterator<Item> itm = playerItem.iterator(); itm.hasNext();){
            Item curItem = itm.next();
            if(curItem.getName().equals(item)){
                playerItem.remove(curItem);
                droppingItem = curItem;
                break;
            }
        }
        if(droppingItem == null) System.out.println("You don't have this item in your inventory");
        else {
            GameMap.getInstance().getCurrentRoom().addItem(droppingItem);
            System.out.println("you have drop " + droppingItem.getName());
        }
    }
    public static void use(String consumableItem){
        List<Item> playerItem = Player.getInstance().getItems();
        Item usingItem = null;
        for(Iterator<Item> itm = playerItem.iterator(); itm.hasNext();){
            Item curItem = itm.next();
            if(curItem.getName().equals(consumableItem) && curItem.getClass().getName().contains("potion")){
                playerItem.remove(curItem);
                usingItem = curItem;
                break;
            }
        }
        if(usingItem == null) System.out.println("you don't have this item in your inventory");
        else{
            ConsumableItem conItem = (ConsumableItem) usingItem;
            conItem.use(Player.getInstance());
            System.out.println("you use " + conItem.getName());
        }
    }
    public static void go(Direction direction){
        GameMap.getInstance().move(direction);
    }
    public static void attackWith(String weaponItem){
        List<Item> playerItem = Player.getInstance().getItems();
        Unit currentMonster = GameMap.getInstance().getCurrentRoom().getUnits().get(0);
        WeaponItem playerWeapon = null;
        for(Iterator<Item> itm = playerItem.iterator(); itm.hasNext();){
            Item curItem = itm.next();
            if(curItem.getName().equals(weaponItem) && curItem.getClass().getName().contains("weapon")){
                playerWeapon = (WeaponItem) curItem;
            }
        }
        Player.getInstance().attack(playerWeapon, currentMonster);
        if(Player.getInstance().isDead()){
            GameMap.getInstance().respawn();
            System.out.println("You are dead respawn at half health at starting location");
        }
        currentMonster.attack(Player.getInstance());
        if(currentMonster.isDead()){
            System.out.println("Successfully kill " + currentMonster.getName());
            GameMap.getInstance().getCurrentRoom().removeUnit(currentMonster);
            currentMonster.dropItem();
        }
    }
    public static void help() {
        String st =  "Available Commands: \n" +
                "info - the current status of the game \n" +
                "take - type in the item name that you want to pick up\n" +
                "drop {item} - drop the {item}\n" +
                "use {item} - use a {potion-item} to heal or activate some weird ability\n" +
                "go {direction} - go north, south, east or west moving up or down\n" +
                "attack with {weapon-item} - attack with the choosen weapon in your inventory\n" +
                "quit - exit the game however you will lose all of your progress";
        System.out.println(st);
    }
    public static void quit(){
        System.out.println("Bye Bye don't give up!");
        System.exit(0);
    }
}
