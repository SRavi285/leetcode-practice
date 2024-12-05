package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowTest {


    SlidingWindow  slidingWindow = new SlidingWindow();

    @Test
    void longestSubString() {
        assertEquals(5, slidingWindow.longestSubString("abcdbea"));
        assertEquals(3, slidingWindow.longestSubString("pwwkew"));
    }




    @Test
    void findMaxAverage() {
//        assertEquals(12.75, slidingWindow.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        double result1 = slidingWindow.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        assertEquals(12.75, result1, 1e-5);
        double result2 = slidingWindow.findMaxAverage(new int[]{5}, 1);
        assertEquals(5.0, result2, 1e-5);
    }
}