package io.muic.ooc;

public class GameMapGenerator {
    public static void generateLevelOne(Room[][] rooms){
        rooms = new Room[10][10];
        for(int y = 0; y < 10; y++){
            for(int x = 0; x < 10; x++){
                rooms[y][x] = new Room();
                rooms[y][x].addAllDirection();
                //TODO need to add unit and item
                if(x == 0){rooms[y][x].removeDirection(Direction.WEST);}
                if (x == 9){rooms[y][x].removeDirection(Direction.EAST);}
                if(y == 0){rooms[y][x].removeDirection(Direction.NORTH);}
                if(y == 9){rooms[y][x].removeDirection(Direction.SOUTH);}
            }
        }
        for(int i = 2; i < 7; i++){
            if(i < 6){
                rooms[i][2].removeDirection(Direction.EAST);
                rooms[i][7].removeDirection(Direction.WEST);
            }
            if(i > 2){
                rooms[1][i].removeDirection(Direction.SOUTH);
                rooms[6][i].removeDirection(Direction.NORTH);

            }
        }
    }
    public static void generateLevelTwo(Room[][] rooms){
        rooms = new Room[15][15];
    }
    public static void generateLevelThree(Room[][] rooms){
        rooms = new Room[20][20];
    }
}
