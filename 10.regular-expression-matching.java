/*
 * @lc app=leetcode id=10 lang=java
 *
 * [10] Regular Expression Matching
 */

// @lc code=start
class Solution {
    public boolean isMatch(String s, String p) {
        /**
        * BF method
         */
         if(s.length() == p.length()) {
             return true;
         }
         boolean res = false, checked = false;
         int i = 0, j = 0;
         while(i < s.length() && j < p.length()) {
             if(s.charAt(i) == '.' || s.charAt(i) == p.charAt(j)){
                 i++;
                 j++;
                 checked = true;
             } else if(p.charAt(j) == '*' && checked == true) {
                 i++;
                 j++;
             }else {
                 j++;
             }
         }
         if(i == s.length()) {
             res =true;
         }
         return res;
    }
}
// @lc code=end

