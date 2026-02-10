package leetcode.dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfBalloonsTest {
    @Test
    void testBasic(){
     MaximumNumberOfBalloons maximumNumberOfBalloons = new MaximumNumberOfBalloons();
        int result = maximumNumberOfBalloons.maxNumberOfBalloons("loonbalxballpoon");
        assertEquals(2, result);

        int result2 = maximumNumberOfBalloons.maxNumberOfBalloons("leetcode");
        assertEquals(0, result2);
    }
}
