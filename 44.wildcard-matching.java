/*
 * @lc app=leetcode id=44 lang=java
 *
 * [44] Wildcard Matching
 */

// @lc code=start
class Solution {
    public boolean isMatch(String s, String p) {
        // stack method
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<s.length(); i++){
            stack.push(s.charAt(i));
        }
        int wait_star_match = 0;
        for(int i = p.length()-1; i >= 0; i--) {
            if(stack.peek() == p.charAt(i) || p.charAt(i) == '?') {
                while(wait_star_match > 0) {
                    stack.pop();
                    wait_star_match--;
                }
                stack.pop();
            } else if(p.charAt(i) == '*') {
                if(i == 0) {
                    stack.clear();
                }else {
                    wait_star_match++;
                }
            }        
        }
        return stack.isEmpty();
    }
    // TODO: DP method
}
// @lc code=end

