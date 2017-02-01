package io.muic.ooc;

import junit.framework.TestCase;

public class LevelOneTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();
        GameMap.getInstance().loadLevelOne();
    }

    public void testIsMove() throws Exception {
        assertFalse(GameMap.getInstance().getCurrentRoom().isMove(Direction.NORTH));
        GameMap.getInstance().move(Direction.EAST);
        assertTrue(GameMap.getInstance().getCurrentRoom().isMove(Direction.EAST));
        GameMap.getInstance().move(Direction.EAST);
        GameMap.getInstance().move(Direction.EAST);
        GameMap.getInstance().move(Direction.EAST);
        GameMap.getInstance().move(Direction.EAST);
        assertFalse(GameMap.getInstance().getCurrentRoom().isMove(Direction.EAST));
    }

    public void testIsMove2() throws Exception {
        GameMap.getInstance().move(Direction.SOUTH);
        assertTrue(GameMap.getInstance().getCurrentRoom().isMove(Direction.NORTH));
        GameMap.getInstance().move(Direction.WEST);
        GameMap.getInstance().move(Direction.WEST);
        GameMap.getInstance().move(Direction.WEST);
        GameMap.getInstance().move(Direction.WEST);
        GameMap.getInstance().move(Direction.WEST);
        assertFalse(GameMap.getInstance().getCurrentRoom().isMove(Direction.WEST));

    }


}