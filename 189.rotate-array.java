import java.util.Arrays;

/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 *
 * https://leetcode.com/problems/rotate-array/description/
 *
 * algorithms
 * Easy (32.78%)
 * Likes:    2139
 * Dislikes: 741
 * Total Accepted:    408.4K
 * Total Submissions: 1.2M
 * Testcase Example:  '[1,2,3,4,5,6,7]\n3'
 *
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 * 
 * Example 1:
 * 
 * 
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation: 
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * 
 * 
 * Note:
 * 
 * 
 * Try to come up as many solutions as you can, there are at least 3 different
 * ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 * 
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        // TODO: need submit?
        // method 1
        if(nums == null || nums.length == 0) return;
        if(k <= 0) return;
        int [] left = new int[k];
        int [] right = new int[nums.length - k];
        int [] res = new int[nums.length];
        System.arraycopy(nums, nums.length - k, left, 0, k);
        System.arraycopy(nums, 0, right, 0, nums.length - k);
        System.arraycopy(left, 0, res, 0, k);
        System.arraycopy(right, 0, res, nums.length - k-1, nums.length - k);  
        System.arraycopy(res, 0, nums, 0, nums.length);     
        // TODO: method 2 
        // TODO: method 3 
    }
}
// @lc code=end

