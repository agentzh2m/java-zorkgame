package io.muic.ooc;

public class GameMap {
    private Room[][] rooms;

    public void loadLevelOne(){
        GameMapGenerator.generateLevelOne(rooms);

    }
    public void loadLevelTwo(){
        rooms = new Room[15][15];
    }
    public void loadLevelThree(){
        rooms = new Room[20][20];
    }

}
