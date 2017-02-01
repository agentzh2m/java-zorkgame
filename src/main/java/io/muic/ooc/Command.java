package io.muic.ooc;

public class Command {
    public static void info(){
        System.out.println(Player.getInstance().getInfo());
        System.out.println("you can go: " + GameMap.getInstance().getCurrentRoom().listDirection());
        System.out.println("item in the room: " + GameMap.getInstance().getCurrentRoom().listItems());
        System.out.println("monster in the room: " + GameMap.getInstance().getCurrentRoom().listUnits());
    }
    public static String take(String item){
        return "";
    }
    public static String drop(String item){
        return "";
    }
    public static String use(String consumableItem){
        return "";
    }
    public static void go(Direction direction){
        GameMap.getInstance().move(direction);
    }
    public static String attackWith(String weaponItem){
        return "";
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
