package io.muic.ooc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Room {
    public Room(int x, int y, int idx) {
        this.x = x;
        this.y = y;
        this.idx = idx;
    }

    private List<Item> items = new ArrayList<>();
    private List<Unit> units = new ArrayList<>();
    private int x;
    private int y;
    private int idx;

    public int getIdx() {
        return idx;
    }

    public void addItem(Item item){items.add(item);}
    public void removeItem(Item item){items.remove(item);}

    public String listItems(){
        return items.toString();
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void addUnits(Unit unit){units.add(unit);}
    public void removeUnit(Unit unit){units.remove(unit);}
    public String listUnits(){
       return units.toString();
    }

    private int getNorth(){
        int northIdx = idx - y;
        if(northIdx >= 0 && northIdx < x*y) return northIdx;
        else return -1;
    }
    private int getSouth(){
        int southIdx = idx + y;
        if (southIdx >= 0 && southIdx < x*y) return southIdx;
        else return -1;
    }
    private int getWest(){
        int westIdx = idx-1;
        if((idx%10) - 1 >= 0 && westIdx < x*y) return westIdx;
        else return -1;
    }
    private int getEast(){
        int eastIdx = idx+1;
        if(eastIdx%x > 0 && eastIdx < x*y) return eastIdx;
        else return -1;
    }

    public boolean isMove(Direction direction){
        switch (direction){
            case EAST: return getEast() >= 0;
            case SOUTH: return getSouth() >= 0;
            case WEST: return getWest() >= 0;
            case NORTH: return getNorth() >= 0;
            default: return false;
        }
    }

    public int getDirection(Direction direction){
        switch (direction){
            case EAST: return getEast();
            case SOUTH: return getSouth();
            case WEST: return getWest();
            case NORTH: return getNorth();
            default: return -1;
        }
    }
    public String listDirection(){
        String validDirection = "[";
        if(getNorth() > 0) validDirection+= "North, ";
        if(getSouth() > 0) validDirection+= "South, ";
        if(getWest() > 0) validDirection+= "West, ";
        if(getEast() > 0) validDirection+= "East ";
        return validDirection + "]";
    }

}
