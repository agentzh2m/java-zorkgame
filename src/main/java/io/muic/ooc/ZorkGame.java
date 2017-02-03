package io.muic.ooc;

import java.util.Random;
import java.util.Scanner;

public class ZorkGame {

    public final static Random random = new Random();


    public void run(){
        Scanner scanner = new Scanner(System.in);
        CommandLineParser cmd = new CommandLineParser();
        System.out.println("Hamuel MUIC ZorkGame 1.0 \n" +
                "You are a freshman at MUIC somehow your two best friend Sea and Ice got capture by the Evil boss Majeed\n" +
                "which is one of the most scariest senior in the whole of CS.\n" +
                "Type help to display all of the commands");
        while (true){
            System.out.printf(">>> ");
            cmd.parse(scanner.nextLine());
        }
    }
}
