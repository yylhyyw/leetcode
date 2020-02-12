/*
 * @lc app=leetcode id=32 lang=java
 *
 * [32] Longest Valid Parentheses
 */

// @lc code=start
class Solution {
    public int longestValidParentheses(String s) {
        /**
         * DP method */
         
         int[] dp = new int[s.length()];
         int res = 0;
         for(int i = 1; i < s.length(); i++){
             if(s.charAt(i) == ')') {
                 if(s.charAt(i-1) == '(') {
                     if(i > 2) dp[i] = dp[i-2] + 2;
                     else dp[i] = 2;
                 } else if((i - dp[i-1]) > 0) {
                     if(s.charAt(i-dp[i-1]-1) == '(') {
                         if(i - dp[i-1]-2 >= 0) {
                             dp[i] = dp[i-1] + dp[i-dp[i-1]-2] + 2; 
                         } else {
                             dp[i] = dp[i-1] + 2;
                         }
                    }
                }
            }
            res = Math.max(res, dp[i]);
        }
    return res;
    }
}
// @lc code=end

