package io.muic.ooc;

import io.muic.ooc.command.Command;
import io.muic.ooc.command.CommandFactory;
import junit.framework.TestCase;

public class CommandTest extends TestCase {

    @Override
    public void setUp() throws Exception{
        super.setUp();
        GameMap.getInstance();
    }
    public void testTake() throws Exception {
        CommandFactory.getCommand("take").apply("Coke");
        CommandFactory.getCommand("take").apply("Coke Zero");
        CommandFactory.getCommand("take").apply("Namthip Water");
    }

    public void testDrop() throws Exception {
        CommandFactory.getCommand("drop").apply("Coke");
        CommandFactory.getCommand("drop").apply("Coke Zero");
        CommandFactory.getCommand("drop").apply("Namthip Water");

    }

    public void testUse() throws Exception {
        CommandFactory.getCommand("use").apply("Coke");
        CommandFactory.getCommand("use").apply("Coke Zero");
        CommandFactory.getCommand("use").apply("Namthip Water");
    }

    public void testGo() throws Exception {
        CommandFactory.getCommand("go").apply("north");
        CommandFactory.getCommand("go").apply("south");
        CommandFactory.getCommand("go").apply("east");
        CommandFactory.getCommand("go").apply("west");
    }

    public void testAttackWith() throws Exception {
        CommandFactory.getCommand("attack with").apply("Water Gun");
        CommandFactory.getCommand("attack with").apply("No Weapon");
        CommandFactory.getCommand("go").apply("east");
        CommandFactory.getCommand("attack with").apply("Stapler Gun");

    }

}