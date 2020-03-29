/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        // DFS method
        if(grid == null || grid.length == 0) {
            return 0;
        }
        int rows = grid.length, cols = grid[0].length, res = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == '1') {
                    dfs(grid, i, j);
                    res++;     
                }
            }
        }
        return res;
    }
    public void dfs(char[][] grid, int i, int j) {
        int rows = grid.length, cols = grid[0].length;
        if(i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
    }
}
// @lc code=end

