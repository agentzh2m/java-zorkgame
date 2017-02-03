package io.muic.ooc.command;

public class Quit implements Command{
    public void apply(String args){
        System.out.println("Bye Bye don't give up!");
        System.exit(0);
    }
}
