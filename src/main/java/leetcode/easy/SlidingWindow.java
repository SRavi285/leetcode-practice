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

}
