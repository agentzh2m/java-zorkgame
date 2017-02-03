package io.muic.ooc;

import junit.framework.TestCase;

public class GameMapGeneratorTest extends TestCase {
    public void testGenerateLevelOne() throws Exception {
        Room[] rooms = null;
        GameMapGenerator gameMapGenerator = new GameMapGenerator();
        rooms = gameMapGenerator.generateLevelOne();
    }

    public void testGenerateLevelTwo() throws Exception {
        Room[] rooms = null;
        GameMapGenerator gameMapGenerator = new GameMapGenerator();
        rooms = gameMapGenerator.generateLevelTwo();

    }

}