/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
<<<<<<< HEAD
 *
 * https://leetcode.com/problems/reverse-bits/description/
 *
 * algorithms
 * Easy (34.66%)
 * Likes:    789
 * Dislikes: 291
 * Total Accepted:    221.5K
 * Total Submissions: 635.5K
 * Testcase Example:  '00000010100101000001111010011100'
 *
 * Reverse bits of a given 32 bits unsigned integer.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: 00000010100101000001111010011100
 * Output: 00111001011110000010100101000000
 * Explanation: The input binary string 00000010100101000001111010011100
 * represents the unsigned integer 43261596, so return 964176192 which its
 * binary representation is 00111001011110000010100101000000.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 11111111111111111111111111111101
 * Output: 10111111111111111111111111111111
 * Explanation: The input binary string 11111111111111111111111111111101
 * represents the unsigned integer 4294967293, so return 3221225471 which its
 * binary representation is 10111111111111111111111111111111.
 * 
 * 
 * 
 * Note:
 * 
 * 
 * Note that in some languages such as Java, there is no unsigned integer type.
 * In this case, both input and output will be given as signed integer type and
 * should not affect your implementation, as the internal binary representation
 * of the integer is the same whether it is signed or unsigned.
 * In Java, the compiler represents the signed integers using 2's complement
 * notation. Therefore, in Example 2 above the input represents the signed
 * integer -3 and the output represents the signed integer -1073741825.
 * 
 * 
 * 
 * 
 * Follow up:
 * 
 * If this function is called many times, how would you optimize it?
 * 
=======
>>>>>>> 7df879fbf8c844fc5f42811ebabe8930046d96dc
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
<<<<<<< HEAD
        // TODO: need sumbit??
        int res = 0;
        for(int i = 0; i < 32; i++) {
            if((1 & n) != 0) {
                res |= 1;
                n >>= 1;
                if(i == 31) {
                    break;
                } else {
                res <<= 1;
                }
            } else {
                res |= 0;
                n >>= 1;
                if(i == 31) {
                    break;
                } else {
                res <<= 1;
                }
=======
        // TODO: need submit?
        int res = 0;
        for(int i = 0; i < 2; i++) {
            if((1&n) != 0) {
                res |= 1;
                n <<= 1;
                res <<= 1;
            } else {
                res |= 0;
                n <<= 1;
                res <<= 1;
>>>>>>> 7df879fbf8c844fc5f42811ebabe8930046d96dc
            }
        }
        return res;
    }
}
// @lc code=end

