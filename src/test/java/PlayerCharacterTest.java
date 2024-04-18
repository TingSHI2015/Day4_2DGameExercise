import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @Test
    public void testGetXReturnsZeroInitially() {

        //GIVEN
        int value=0;

        //WHEN
        int actualResult = PlayerCharacter.getX(value);

        //THEN
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult, "test failed for testGetXReturnsZeroInitially");
    }

}
