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
}