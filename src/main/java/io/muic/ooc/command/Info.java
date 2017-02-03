package io.muic.ooc.command;

import io.muic.ooc.GameMap;
import io.muic.ooc.Player;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.ansi;

public class Info implements Command{
    public void apply(String args){
        AnsiConsole.systemInstall();
        System.out.println("-----------------------------------------------");
        type1("Player info");
        type2(Player.getInstance().getInfo());
        System.out.println("-----------------------------------------------");
        type1("Room info");
        type2("you can go: " + GameMap.getInstance().getCurrentRoom().listDirection());
        type2("item in the room: " + GameMap.getInstance().getCurrentRoom().listItems());
        type2("monster in the room: " + GameMap.getInstance().getCurrentRoom().listUnits());
        System.out.println("-----------------------------------------------");
        if(GameMap.getInstance().getCurrentRoom().getUnits().size() > 0) //check if there is unit to display info
            type2(GameMap.getInstance().getCurrentRoom().getUnits().get(0).getInfo());
        else
            type2("there is no monster in this room");
        AnsiConsole.systemUninstall();
    }

    private void type1(String st){
        System.out.println(ansi().fg(Ansi.Color.WHITE).bg(Ansi.Color.MAGENTA).a(st).reset());
    }

    private void type2(String st){
        System.out.println(ansi().fg(Ansi.Color.GREEN).a(st).reset());
    }

}
