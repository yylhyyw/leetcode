/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // two-pointer
        // TODO: need sumbit?
        if(nums == null || nums.length == 0) {
            return null;
        } 
        int length = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < length-2; i++) {
            if(nums[i] == 0) break;
            int left = i+1, right = length-1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < 0) {
                    left++;
                }else if(sum > 0) {
                    right--;
                }else{
                    res.add(Arrays.asList(i, left, right));
                    break;
                }
            }
        }
        return res;
    }
}
// @lc code=end

