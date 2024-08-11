package leetcode.easy;

import java.util.HashMap;

public class SlidingWindow {
    public   int longestSubString (String str) {
        int n = str.length();
        int result = 0;
        int startIndex = 0;
        HashMap<Character, Integer> lastIndex = new HashMap<>();

        for (int index = 0; index < n; index++) {
            if (lastIndex.containsKey(str.charAt(index))) {
                startIndex = Math.max(startIndex, lastIndex.get(str.charAt(index)) + 1);
            }
            result = Math.max(result, index - startIndex + 1);

            lastIndex.put(str.charAt(index), index);
        }
        return result;
    }

    /**
     * Find maximum sum of a sub array of size K
     *
     * @param numbs
     * @param index
     * @return int
     * @TimeComplexity O(n)
     * @SpaceComplexity O(1)
     * @TimeTaken 35ms
    */
    public double findMaxAverage (int[] numbs, int index) {
        int n = numbs.length;
        double maxAverage =  Double.NEGATIVE_INFINITY;
        double windowSum = 0;
        for (int i = 0; i < index; i++) {
            windowSum += numbs[i];
        }
        maxAverage = windowSum / index;

        for (int right = index; right < n; right++) {
            windowSum += numbs[right] - numbs[right - index];
            maxAverage = Math.max(maxAverage, (double) windowSum / index);
        }
        System.out.println(maxAverage);
        return maxAverage;
    }

}
