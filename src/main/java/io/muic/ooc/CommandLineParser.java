package io.muic.ooc;

public class CommandLineParser  {
    private final Command command = new Command();

    public void parse(String string){
        String[] stringTok = string.split(" ");
        if(stringTok.length == 1){
            switch (stringTok[0]){
                case "info": command.info(); break;
                case "help": command.help(); break;
                case "quit": command.quit(); break;
                default:
                    System.out.println("Invalid Command");
            }

        }else{
            switch (stringTok[0]){
                case "take": command.take(parseArg(stringTok, 1));break;
                case "drop": command.drop(parseArg(stringTok, 1));break;
                case "use": command.use(parseArg(stringTok, 1));break;
                case "go": command.go(parseDirection(stringTok[1]));break;
                case "attack": {
                    if(stringTok[1].equals("with")){
                        command.attackWith(parseArg(stringTok, 2));
                        break;
                    }
                }
                default:
                    System.out.println("Invalid Command");
            }
        }
    }

    public String parseArg(String[] stringTok, int iargs){
        String args = "";
        for(int i = iargs; i < stringTok.length; i++){
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
