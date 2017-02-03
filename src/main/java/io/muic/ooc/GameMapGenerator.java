package io.muic.ooc;
import java.util.Random;

public class GameMapGenerator {
    private final static Random random = ZorkGame.random;
    private final static double MONSTER_PROBABILITY = 0.75;
    private final static int MONSTER_LIMIT = 3;
    private final static int ITEM_LIMIT = 3;
    public  Room[] generateLevelOne(){
        final int X = 10;
        final int Y = 10;
        Room[] rooms = new Room[X*Y];
        for(int i = 0; i < X*Y; i++){
            if(i > 42 && i < 77 && i%X > 2 && i%X < 7){
                rooms[i] = null; //creating a wall not trump wall
            }else{
                rooms[i] = new Room(X,Y,i);
                if(random.nextDouble() <= MONSTER_PROBABILITY){
                    for (int j = 0; j < random.nextInt(MONSTER_LIMIT); j++) {
                        rooms[i].addUnits(UnitFactory.getUnit("ham-minion"));
                    }
                    for (int j = 0; j < random.nextInt(ITEM_LIMIT); j++) {
                        rooms[i].addItem(ItemFactory.randomPotion());
                    }
                }
            }
        }
        int[] corners = {9, 90, 99};
        //add boss to a random corner
        int randomCornerIndex = random.nextInt(corners.length);
        rooms[corners[randomCornerIndex]].addUnits(UnitFactory.getUnit("pj"));
//        System.out.println("FOR DEV purposes// BOSS ROOM: " + corners[randomCornerIndex]);
        return rooms;

    }
    public Room[] generateLevelTwo(){
        final int X = 12;
        final int Y = 12;
        Room[] rooms = new Room[X*Y];
        for(int i = 0; i < X*Y; i++){
            if ((i > 24 && i < 68 && i%X > 4 && i%Y < 8) ||
                    (i > 94 && i < 128 && i%X > 4 && i%Y < 8)){
                rooms[i] = null;
            }else{
                rooms[i] = new Room(X,Y,i);
                if(random.nextDouble() <= MONSTER_PROBABILITY){
                    for (int j = 0; j < random.nextInt(MONSTER_LIMIT); j++) {
                        rooms[i].addUnits(UnitFactory.getUnit("tow-minion"));
                    }
                    for (int j = 0; j < random.nextInt(ITEM_LIMIT); j++) {
                        rooms[i].addItem(ItemFactory.randomPotion());
                    }
                }
            }
        }
        int[] corners = {11, 143, 132};
        int randomBossy = random.nextInt(corners.length);
        int randomJohn = random.nextInt(corners.length);
        rooms[corners[randomBossy]].addUnits(UnitFactory.getUnit("bossy"));
        rooms[corners[randomJohn]].addUnits(UnitFactory.getUnit("johny"));
        return rooms;
    }
    public static Room[] generateLevelThree(){
        final int X = 10;
        final int Y = 10;
        Room[] rooms = new Room[X*Y];
        for(int i = 0; i < X*Y; i++){
            if(i > 42 && i < 77 && i%X > 2 && i%X < 7){
                rooms[i] = null; //creating a wall not trump wall
            }else{
                rooms[i] = new Room(X,Y,i);
                if(random.nextDouble() <= MONSTER_PROBABILITY){
                    for (int j = 0; j < random.nextInt(MONSTER_LIMIT); j++) {
                        rooms[i].addUnits(UnitFactory.getUnit("tow-minion"));
                        rooms[i].addUnits(UnitFactory.getUnit("pj"));
                    }
                    for (int j = 0; j < random.nextInt(ITEM_LIMIT); j++) {
                        rooms[i].addItem(ItemFactory.randomPotion());
                    }
                }
            }
        }
        int[] corners = {9, 90, 99};
        //add boss to a random corner
        int randomCornerIndex = random.nextInt(corners.length);
        rooms[corners[randomCornerIndex]].addUnits(UnitFactory.getUnit("possessed-ice"));
//        System.out.println("FOR DEV purposes// BOSS ROOM: " + corners[randomCornerIndex]);
        return rooms;
    }
}
