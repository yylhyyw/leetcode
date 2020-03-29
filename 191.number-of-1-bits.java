/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

// @lc code=start
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // TODO: need submit??
        int bitsNum = 0;
        int mask = 1;
        for(int i = 0; i < 32; i++) {
            if((n & mask) != 0){
                bitsNum++;
            }
            mask <<= 1;
        }
        return bitsNum; 
    }
}
// @lc code=end

