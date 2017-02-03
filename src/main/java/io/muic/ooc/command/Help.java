package io.muic.ooc.command;

public class Help implements Command{
    public void apply(String args) {
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
}
