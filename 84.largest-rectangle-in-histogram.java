import java.util.Stack;

/*
 * @lc app=leetcode id=84 lang=java
 *
 * [84] Largest Rectangle in Histogram
 */

// @lc code=start
class Solution {
    public int largestRectangleArea(int[] heights) {
        // dp method
        // TODO：need finished?
        Stack<Integer> stack = new Stack<Integer>();
        int length = heights.length, area = 0;
        for(int i = 0; i < length; i++) {
            if(stack.empty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i);
            } else {
                while(!stack.empty()) {
                    stack.pop()
                }
            }
        }
    }
}
// @lc code=end

