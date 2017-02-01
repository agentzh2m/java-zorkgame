package io.muic.ooc;
import java.util.Arrays;
import java.util.Random;

public class GameMapGenerator {
    private final static Random random = new Random();
    private final static double MONSTER_PROBABILITY = 0.5;
    private final static int MONSTER_LIMIT = 3;
    private final static int ITEM_LIMIT = 3;
    public static Room[] generateLevelOne(Room[] rooms){
        final int X = 10;
        final int Y = 10;
        rooms = new Room[X*Y];
        for(int i = 0; i < 100; i++){
            if(i > 42 && i < 77 && i%10 > 2 && i%10 < 7){
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
        rooms[corners[random.nextInt(corners.length)]].addUnits(UnitFactory.getUnit("pj"));
        return rooms;

    }
    public static void generateLevelTwo(Room[] rooms){
        rooms = new Room[15*15];
    }
    public static void generateLevelThree(Room[] rooms){
        rooms = new Room[20*20];
    }
}
