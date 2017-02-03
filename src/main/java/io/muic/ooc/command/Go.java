package io.muic.ooc.command;

import io.muic.ooc.Direction;
import io.muic.ooc.GameMap;

public class Go implements Command{
    public void apply(String direction){
        if(parseDirection(direction) != null) GameMap.getInstance().move(parseDirection(direction));
        else System.out.println("Invalid command");
    }

    public Direction parseDirection(String direction){
        switch (direction){
            case "north": return Direction.NORTH;
            case "south": return Direction.SOUTH;
            case "west": return Direction.WEST;
            case "east": return Direction.EAST;
            default: return null;
        }
    }
}
