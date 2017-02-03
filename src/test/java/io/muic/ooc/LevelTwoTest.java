package io.muic.ooc;

import junit.framework.TestCase;

public class LevelTwoTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();
        GameMap.getInstance().loadLevelTwo();
        new ZorkGame();
    }

    public void testIsMove() throws Exception {
        GameMap.getInstance().move(Direction.EAST);
        GameMap.getInstance().move(Direction.EAST);
        GameMap.getInstance().move(Direction.EAST);
        GameMap.getInstance().move(Direction.EAST);
        GameMap.getInstance().move(Direction.EAST);
        assertNotNull(GameMap.getInstance().getCurrentRoom());
    }

    public void testIsMove2() throws Exception {
        GameMap.getInstance().move(Direction.SOUTH);
        GameMap.getInstance().move(Direction.WEST);
        GameMap.getInstance().move(Direction.WEST);
        GameMap.getInstance().move(Direction.WEST);
        GameMap.getInstance().move(Direction.WEST);
        GameMap.getInstance().move(Direction.WEST);
        assertNotNull(GameMap.getInstance().getCurrentRoom());

    }

    public void testIsMove3() throws Exception {
        GameMap.getInstance().move(Direction.SOUTH);
        GameMap.getInstance().move(Direction.SOUTH);
        GameMap.getInstance().move(Direction.SOUTH);
        GameMap.getInstance().move(Direction.EAST);
        assertNotNull(GameMap.getInstance().getCurrentRoom());

    }

    public void testIsMove4() throws Exception {
        GameMap.getInstance().move(Direction.WEST);
        GameMap.getInstance().move(Direction.WEST);
        GameMap.getInstance().move(Direction.WEST);
        GameMap.getInstance().move(Direction.WEST);
        GameMap.getInstance().move(Direction.WEST);
        assertNotNull(GameMap.getInstance().getCurrentRoom());
    }

    public void testIsMove5() throws Exception {
        GameMap.getInstance().move(Direction.SOUTH);
        GameMap.getInstance().move(Direction.SOUTH);
        GameMap.getInstance().move(Direction.SOUTH);
        GameMap.getInstance().move(Direction.SOUTH);
        GameMap.getInstance().move(Direction.SOUTH);
        GameMap.getInstance().move(Direction.SOUTH);
        GameMap.getInstance().move(Direction.SOUTH);
        assertNotNull(GameMap.getInstance().getCurrentRoom());

    }

}