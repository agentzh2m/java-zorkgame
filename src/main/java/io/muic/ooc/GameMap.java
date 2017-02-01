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
            if(rooms[currentRoom.getDirection(direction)] != null){
                currentRoom = rooms[currentRoom.getDirection(direction)];
                System.out.println("Move to room " + currentRoom.getIdx());
            }else{
                System.out.println("Cannot go " + direction + " you have hit a wall");
            }
        }

    }


    public static GameMap getInstance() {return ourInstance;}

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void loadLevelOne(){
        rooms = GameMapGenerator.generateLevelOne(rooms);
        currentRoom = rooms[5];
        System.out.println("Objective: \n" +
                "For the first level you are surrounded by Ham's Minion his soul got capture by Majeed\n" +
                "  and Majeed use Ham soul to generate minions to go and rescue you need to beat the poor old PJ the gate keeper that never die\n" +
                "  you will be teleported to the next level immediately");

    }
    public void loadLevelTwo(){

    }
    public void loadLevelThree(){

    }

}
