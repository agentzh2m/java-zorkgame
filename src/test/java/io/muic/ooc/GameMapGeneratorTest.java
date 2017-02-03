package io.muic.ooc;

import junit.framework.TestCase;

public class GameMapGeneratorTest extends TestCase {
    public void testGenerateLevelOne() throws Exception {
        Room[] rooms = null;
        GameMapGenerator gameMapGenerator = new GameMapGenerator();
        rooms = gameMapGenerator.generateLevelOne();
        assertNotNull(rooms);
    }

    public void testGenerateLevelTwo() throws Exception {
        Room[] rooms = null;
        GameMapGenerator gameMapGenerator = new GameMapGenerator();
        rooms = gameMapGenerator.generateLevelTwo();
        assertNotNull(rooms);

    }

    public void testGenerateLevelThree() throws Exception {
        Room[] rooms = null;
        GameMapGenerator gameMapGenerator = new GameMapGenerator();
        rooms = gameMapGenerator.generateLevelThree();
        assertNotNull(rooms);
    }

}