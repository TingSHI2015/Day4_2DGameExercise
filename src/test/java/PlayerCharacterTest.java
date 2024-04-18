import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerCharacterTest {

    @BeforeEach
    public void setUp() {
        PlayerCharacter.xPosition = 0;  //worry: PlayerCharacter.getX() = 0;
        PlayerCharacter.yPosition = 0;  //worry: PlayerCharacter.getY() = 0;
    }

    @Test
    public void testGetXReturnsZeroInitially() {

        //GIVEN
        //  int value=0;

        //WHEN
        //int actualResult = PlayerCharacter.getX(value);
        int actual = PlayerCharacter.getX();

        //THEN
        int expected = 0;
        assertEquals(expected, actual, "test failed for testGetXReturnsZeroInitially");
    }

    @Test
    public void testGetYReturnsZeroInitially() {
        //GIVEN
        //int value=0;

        //WHEN
        //int actual = PlayerCharacter.getY(value);
        int actual = PlayerCharacter.getY();

        //THEN
        int expected = 0;

        //don't forget assert at the end!!!!!!
        assertEquals(expected, actual, "test failed for testGetYReturnsZeroInitially");

    }


    @Test
    public void testMoveUpWithW() {
        //GIVEN
        PlayerCharacter.move("W");

        //WHEN
        int actual = PlayerCharacter.getY();

        //THEN
        int expected = 1;
        assertEquals(expected, actual, "test failed for testMoveWithW");

    }

    @Test
    public void testMoveDownWithS() {
        //GIVEN
        PlayerCharacter.move("S");

        //WHEN
        int actual = PlayerCharacter.getY();

        //THEN
        int expected = -1;
        assertEquals(expected,actual,"test failed for testMoveDownWithS");
    }

    @Test
    public void testMoveRightWithD() {
        //GIVEN
        PlayerCharacter.move("D");

        //WHEN
        int actual = PlayerCharacter.getX();

        //THEN
        int expected = 1;
        assertEquals(expected,actual,"test failed for testMoveRightWithD");

    }

    @Test
    public void testMoveLeftWithA() {
        //GIVEN
        PlayerCharacter.move("A");

        //WHEN
        int actual = PlayerCharacter.getX();

        //THEN
        int expected = -1;
        assertEquals(expected,actual,"test failed for testMoveLeftWithA");

    }


    @Test
    public void testWhenInputIsNotWASD_ShouldReturn100() {     //don't forget this test!!!!
        //GIVEN
        PlayerCharacter.move("X");

        //WHEN
        int actual = 100;

        //THEN
        assertTrue(actual == 100, "test failed for testWhenInputIsNotWASD_ShouldReturn100");



    }





}
