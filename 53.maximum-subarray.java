/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        //dp method
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int right = 0, sum = 0, res = 0;
        for(int i = 1; i<nums.length; i++) {
            dp[i] = dp[i-1] + nums[i];
            if(dp[i] >= dp[right]) {
                right = i;
            }
        }
        for(int i = right; i >= 0; i--) {
            sum+=nums[i];
            res = Math.max(res, sum);
        }
        return res;
    }
}
// @lc code=end

