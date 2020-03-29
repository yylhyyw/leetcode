/*
 * @lc app=leetcode id=85 lang=java
 *
 * [85] Maximal Rectangle
 */

// @lc code=start
class Solution {
    public int maximalRectangle(char[][] matrix) {
        // BF method
        // TODO: need finished?
        int row = matrix.length, col = matrix[0].length;
        int[][] dp = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix[i+1][j] == '1' && matrix[i][j+1] == '1') {
                    dp[i][j] = 1;
                }
            }

        }
    }
}
// @lc code=end

