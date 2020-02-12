/*
 * @lc app=leetcode id=63 lang=java
 *
 * [63] Unique Paths II
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //dp method
        // TODO: need vaild?
        int n = obstacleGrid.length, m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        for(int i = 0; i<m; i++) {
            dp[0][i] = 1;
        }
        for(int i = 0; i<n; i++) {
            dp[i][0] = 1;
        }
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(obstacleGrid[i][j] == 1) {
                    dp[i][j] = -1;
                } else {
                    if(dp[i-1][j] >= 0 && dp[i][j-1] >= 0) {
                        dp[i][j] = dp[i-1][j] + dp[i][j-1];
                    } else if(dp[i-1][j] < 0) {
                        dp[i][j] = (dp[i][j-1] >= 0 ? dp[i][j-1] : 0);
                    } else if(dp[i][j-1] < 0) {
                        dp[i][j] = (dp[i-1][j] >= 0 ? dp[i-1][j] : 0);
                    }
                }
            }
        }
        return dp[n-1][m-1];
    }
}
// @lc code=end

