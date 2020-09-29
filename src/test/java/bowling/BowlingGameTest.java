package bowling;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BowlingGameTest {

    @Test
    public void mustBeAbleToCreateInstance() {
        //Arrange, Act
        BowlingGame bowlingGame = new BowlingGame();
        //Assert
        assertNotNull(bowlingGame);
    }
}
