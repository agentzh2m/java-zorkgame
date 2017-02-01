package io.muic.ooc;

public class CommandLineParser  {

    public void parse(String string){
        String[] stringTok = string.split(" ");
        if(stringTok.length == 1){
            switch (stringTok[0]){
                case "info": Command.info(); break;
                case "help": Command.help(); break;
                case "quit": Command.quit(); break;
                default:
                    System.out.println("Invalid Command");
            }

        }else if(stringTok.length == 2){
            switch (stringTok[0]){
                case "take": Command.take(stringTok[1]);break;
                case "drop": Command.drop(stringTok[1]);break;
                case "use": Command.use(stringTok[1]);break;
                case "go": Command.go(parseDirection(stringTok[1]));break;
                default:
                    System.out.println("Invalid Command");
            }
        }else if(stringTok.length == 3){
            if(stringTok[0].equals("attack") && stringTok[1].equals("with")){
                Command.attackWith(stringTok[3]);
            }
        }
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
