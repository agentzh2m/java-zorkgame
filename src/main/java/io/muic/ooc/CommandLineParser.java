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

        }else{
            switch (stringTok[0]){
                case "take": Command.take(parseArg(stringTok));break;
                case "drop": Command.drop(parseArg(stringTok));break;
                case "use": Command.use(parseArg(stringTok));break;
                case "go": Command.go(parseDirection(stringTok[1]));break;
                case "attack":
                    System.out.println("I dunno what to do");
                default:
                    System.out.println("Invalid Command");
            }
        }
    }

    public String parseArg(String[] stringTok){
        String args = "";
        for(int i = 1; i < stringTok.length; i++){
            if(i == stringTok.length - 1) args += stringTok[i];
            else args += stringTok[i] + " ";
        }
        return args;
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
