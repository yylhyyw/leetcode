import java.util.HashSet;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        /**
         * Brute Force
         */
        // if(s.length() <= 0) return 0;
        // int count = 0;
        // for(int i = 0; i < s.length(); i++) {
        //     HashSet<Character> set = new HashSet<Character>();
        //     for(int j = i; j < s.length(); j++) {
        //         Character ch = s.charAt(j);
        //         if(set.contains(ch)){
        //             count = Math.max(count, set.size());
        //             break;
        //         } else {
        //             set.add(ch);
        //         }
        //     }
            
        // }
        // return count;
        /**
         * two pointers
         */
        HashSet<Character> set = new HashSet<Character>();
        int start = 0, end = 0, count = 0, length = s.length();
        while(start < length && end < length) {
            if(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            } else {
                set.add(s.charAt(end));
                end++;
                count = Math.max(count, end-start);
            }
        }
        return count;
    }
}
// @lc code=end

