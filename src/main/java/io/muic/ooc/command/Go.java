package io.muic.ooc.command;

import io.muic.ooc.Direction;
import io.muic.ooc.GameMap;

public class Go implements Command{
    public void apply(String direction){
        GameMap.getInstance().move(parseDirection(direction));
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
