package io.muic.ooc;

import junit.framework.TestCase;

public class CommandTest extends TestCase {

    @Override
    public void setUp() throws Exception{
        super.setUp();
        GameMap.getInstance().loadLevelOne();
    }
    public void testTake() throws Exception {
        Command command = new Command();
        command.take("Coke");
        command.take("Coke Zero");
        command.take("Namthip Water");
    }

    public void testDrop() throws Exception {
        Command command = new Command();
        command.drop("Coke");
        command.drop("Coke Zero");
        command.drop("Namthip Water");

    }

    public void testUse() throws Exception {
        Command command = new Command();
        command.use("Coke");
        command.use("Chicken");
        command.use("Namthip Water");
    }

    public void testGo() throws Exception {
        Command command = new Command();
        command.go(Direction.NORTH);
        command.go(Direction.WEST);
        command.go(Direction.EAST);
        command.go(Direction.SOUTH);
    }

    public void testAttackWith() throws Exception {
        Command command = new Command();
        command.attackWith("Water Gun");
        command.attackWith("No Weapon");
        command.go(Direction.EAST);
        command.attackWith("Stapler Gun");

    }

}