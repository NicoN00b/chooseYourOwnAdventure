package Models;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void  testGameInput_oneLetter() throws Exception {
        Game testGame = new Game();
        String expected = "e";
        assertEquals(expected, testGame.choiceEvaluator("a", "e"));
    }
}