package io.muic.ooc.command;

import io.muic.ooc.GameMap;
import io.muic.ooc.Player;

public class Info implements Command{
    public void apply(String args){
        System.out.println(Player.getInstance().getInfo());
        System.out.println("you can go: " + GameMap.getInstance().getCurrentRoom().listDirection());
        System.out.println("item in the room: " + GameMap.getInstance().getCurrentRoom().listItems());
        System.out.println("monster in the room: " + GameMap.getInstance().getCurrentRoom().listUnits());
        if(GameMap.getInstance().getCurrentRoom().getUnits().size() > 0) //check if there is unit to display info
            System.out.println(GameMap.getInstance().getCurrentRoom().getUnits().get(0).getInfo());
        else
            System.out.println("there is no monster in this room");
    }
}
