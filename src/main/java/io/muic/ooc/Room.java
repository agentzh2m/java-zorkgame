package io.muic.ooc;

import java.util.Arrays;
import java.util.List;

public class Room {
    private List<Direction> directions;
    private List<Item> items;
    private List<Unit> units;

    public void addItem(Item item){items.add(item);}
    public void removeItem(Item item){items.remove(item);}

    public String listItems(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Item item: items){stringBuilder.append(item.getName() + " ");}
        return stringBuilder.toString();
    }

    public void addUnits(Unit unit){units.add(unit);}
    public void removeUnit(Unit unit){units.remove(unit);}
    public String listUnits(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Unit unit: units){stringBuilder.append(unit.getName() + " ");}
        return stringBuilder.toString();
    }

    public void addAllDirection(){directions.addAll(Arrays.asList(Direction.NORTH, Direction.EAST, Direction.WEST, Direction.SOUTH));}
    public boolean isMove(Direction direction){return directions.contains(direction);}
    public void removeDirection(Direction direction){directions.remove(direction);}
    public String listDirection(){
        String string = "";
        for(Direction direction: directions){string+= direction.toString() + " ";}
        return string;
    }

}
