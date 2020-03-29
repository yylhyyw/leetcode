/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        // DP method
        // TODO: need submit?
        if(nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        for(int i = 0; i < nums.length; i+=2) {
            if(i == 0) dp[i] = nums[i];
            else dp[i] = dp[i-2] + nums[i];
        }
        for(int i = 1; i < nums.length; i+=2) {
            if(i == 1) dp[i] = nums[i];
            else dp[i] += dp[i-2] + nums[i];
        }
        return Math.max(dp[nums.length-1], dp[nums.length-2]);
    }
}
// @lc code=end

