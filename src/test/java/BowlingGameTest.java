import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void should_return_results_when_strike_in_the_last_time(){
        int score[][] = {{10},{10},{10},{10},{10},{10},{10},{10},{10},{10,10,10}};
        BowlingGame game = new BowlingGame();
        assertEquals(game.countScore(score),300);
    }

    @Test
    void should_return_results_when_spare_in_the_last_time(){
        int score[][] = {{10},{10},{10},{10},{10},{10},{10},{10},{10},{5,5,10}};
        BowlingGame game = new BowlingGame();
        assertEquals(game.countScore(score),275);
    }

    @Test
    void should_return_results_when_not_get10_in_the_last_time(){
        int score[][] = {{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}};
        BowlingGame game = new BowlingGame();
        assertEquals(game.countScore(score),0);
    }

}
