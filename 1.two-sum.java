/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> given_nums = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(given_nums.containsKey(target - nums[i])) {
                return new int[] {given_nums.get(target-nums[i]), i};
            }
            given_nums.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
// @lc code=end

