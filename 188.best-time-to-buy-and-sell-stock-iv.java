/*
 * @lc app=leetcode id=188 lang=java
 *
 * [188] Best Time to Buy and Sell Stock IV
 */

// @lc code=start
class Solution {
    public int maxProfit(int k, int[] prices) {
        // dp method
        // TODO: need submit?
        if(k==0) return 0;
        if(prices == null | prices.length == 0) return 0;
        int profit = 0;
        // BF method
        for(int i = 0; i < prices.length; i++) {
            for(int j = j+1; j < prices.length; j++) {
                profit = Math.max(profit, prices[i] - prices[j]);
                if(profit <= )
                // df ds ...
                // if ds < df max: df
                // if ds > df max: ds
            }
        }
        
    }
}
// @lc code=end

