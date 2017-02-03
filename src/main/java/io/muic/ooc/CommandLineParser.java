package io.muic.ooc;

import io.muic.ooc.command.Command;
import io.muic.ooc.command.CommandFactory;
import io.muic.ooc.command.Info;

public class CommandLineParser  {

    public void parse(String string){
        String[] stringTok = string.split(" ");
        if(stringTok.length == 1){
            switch (stringTok[0]){
                case "info": CommandFactory.getCommand("info").apply(null); break;
                case "help": CommandFactory.getCommand("help").apply(null); break;
                case "quit": CommandFactory.getCommand("quit"); break;
                default:
                    System.out.println("Invalid Command");
            }

        }else{
            switch (stringTok[0]){
                case "take": CommandFactory.getCommand("take").apply(parseArg(stringTok,1));break;
                case "drop": CommandFactory.getCommand("drop").apply(parseArg(stringTok,1));break;
                case "use": CommandFactory.getCommand("use").apply(parseArg(stringTok,1));break;
                case "go": CommandFactory.getCommand("go").apply(parseArg(stringTok, 1));break;
                case "attack": {
                    if(stringTok[1].equals("with")){
                        CommandFactory.getCommand("attack with").apply(parseArg(stringTok, 2));
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



}
