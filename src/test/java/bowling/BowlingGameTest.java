package bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BowlingGameTest {
    private Game game;

    @BeforeEach
    protected void setUp() {
        game = new Game();
    }

    @Test
    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            game.roll(pins);
    }

    @Test
    public void TestGutter() {
        //Arrange,
        // Act
        rollMany(20, 0);
        //Assert
        assertEquals(0, game.score());
    }


    @Test
    public void testAllOnes() throws Exception {
        rollMany(20, 1);
        //Assert
        assertEquals(20, game.score());
    }

    @Test
    public void testOneSpare() {
        rollSpare();
        game.roll(3);
        rollMany(17, 0);
        assertEquals(16, game.score());
    }

    @Test
    public void testOneStrike() {
        rollStrike();
        game.roll(3);
        game.roll(4);
        rollMany(16, 0);
        assertEquals(24, game.score());
    }

    @Test
    public void testPerfectGame() {
        rollMany(12, 10);
        assertEquals(300, game.score());
    }

    @Test
    private void rollStrike() {
        game.roll(10);
    }

    @Test
    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }
}
