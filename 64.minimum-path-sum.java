/*
 * @lc app=leetcode id=64 lang=java
 *
 * [64] Minimum Path Sum
 */

// @lc code=start
class Solution {
    public int minPathSum(int[][] grid) {
        // dp method
        // TODO: need Valid?
        int m = grid[0].length, n = grid.length;
        int[][] dp = new int[n][m];
        dp[0][0] = grid[0][0];
        for(int i = 1; i < m; i++) {
            dp[0][i] = grid[0][i] + dp[0][i-1];
        }
        for(int i = 1; i < n; i++) {
            dp[i][0] =grid[i][0] + dp[i-1][0];
        }
        for(int i = 1; i < n; i++) {
            for( int j = 1; j < m; j++) {
                dp[i][j] = Math.min((dp[i-1][j] + grid[i][j]), (dp[i][j-1] + grid[i][j]));
            }
        }
        return dp[n-1][m-1];
    }
}
// @lc code=end

