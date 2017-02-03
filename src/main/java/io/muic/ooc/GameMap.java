package io.muic.ooc;

import org.fusesource.jansi.Ansi;

import java.util.Random;

import static org.fusesource.jansi.Ansi.ansi;

public class GameMap {
    private Room[] rooms;
    private Room currentRoom;
    private GameMap gameMap;
    private int startingRoom = 5;
    private static GameMap ourInstance = new GameMap();
    private final Random random = ZorkGame.random;

    private GameMap() {
        loadLevelOne();
    }

    public Room[] getRooms() {
        return rooms;
    }

    public Random getRandom() {
        return random;
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

    public void respawn(){
        currentRoom = rooms[startingRoom];
    }

    public static GameMap getInstance() {return ourInstance;}

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void loadLevelOne(){
        GameMapGenerator gameMapGenerator = new GameMapGenerator();
        rooms = gameMapGenerator.generateLevelOne();
        currentRoom = rooms[startingRoom];
        Player.getInstance().pickItem(ItemFactory.getWeapon("water-gun"));
        printer("Objective: \n" +
                "For the first level you are surrounded by Ham's Minion his soul got capture by Majeed\n" +
                "and Majeed use Ham soul to generate minions to go and rescue you need to beat the poor old PJ the gate keeper that never die\n" +
                "you will be teleported to the next level immediately");

    }
    public void loadLevelTwo(){

        GameMapGenerator gameMapGenerator = new GameMapGenerator();
        rooms = gameMapGenerator.generateLevelTwo();
        currentRoom = rooms[startingRoom];
        printer("Objective: \n" +
                "Beat Bossy and pTow to move to the next level");

    }
    public void loadLevelThree(){
        GameMapGenerator gameMapGenerator = new GameMapGenerator();
        rooms = gameMapGenerator.generateLevelThree();


    }

    private void printer(String st){
        System.out.println(ansi().bg(Ansi.Color.WHITE).fg(Ansi.Color.BLACK).a(st).reset());
    }

}
