/*
 * @lc app=leetcode id=199 lang=java
 *
 * [199] Binary Tree Right Side View
 */

// @lc code=start

//   Definition for a binary tree node.
//   public class TreeNode {
//       int val;
//       TreeNode left;
//       TreeNode right;
//     TreeNode(int x) { val = x; }
//  }

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        // DFS method
        // TODO: need submit?
        // TODO: need second review.
        if(root == null) return null;
        Stack<Integer> nodeStack = new Stack<Integer>();
        ArrayList<TreeNode> levelArray = new ArrayList<TreeNode>();
        List<Integer> res = new ArrayList<Integer>();
        res.add(root.val);
        levelArray.add(root);
        nodeStack.push(root.val);
        nodeStack.push(null);
        while(levelArray.size() != 0) {
            ArrayList<TreeNode> tmpLevelArray = new ArrayList<TreeNode>();
            for(int i = 0; i < levelArray.size(); i++){
                if(levelArray.get(i).left != null) {
                    nodeStack.push(levelArray.get(i).left.val);
                    tmpLevelArray.add(levelArray.get(i).left);
                }
                if(levelArray.get(i).right != null){
                    nodeStack.push(levelArray.get(i).right.val);
                    tmpLevelArray.add(levelArray.get(i).right);
                }
            }
            if(tmpLevelArray.size() != 0) {
                res.add(nodeStack.peek());
            }
            levelArray = tmpLevelArray;
        }
        return res;
    }

}
// @lc code=end

