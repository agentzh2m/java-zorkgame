package io.muic.ooc;

import java.util.Arrays;

public class GameMap {
    private Room[] rooms;
    private Room currentRoom;
    private GameMap gameMap;
    private static GameMap ourInstance = new GameMap();

    private GameMap() {
        loadLevelOne();
    }

    public void move(Direction direction){
        if (!currentRoom.isMove(direction)){
            System.out.println("Cannot go " + direction);
        }else {
            currentRoom = rooms[currentRoom.getDirection(direction)];
            System.out.println("Move to room " + currentRoom.getIdx());
        }

    }


    public static GameMap getInstance() {return ourInstance;}

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void loadLevelOne(){
        rooms = GameMapGenerator.generateLevelOne(rooms);
        currentRoom = rooms[5];

    }
    public void loadLevelTwo(){

    }
    public void loadLevelThree(){

    }

}
