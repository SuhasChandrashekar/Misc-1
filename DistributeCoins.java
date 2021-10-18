// Time Complexity : O(n)
// Space Complexity : O(1)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int moves;
    public int distributeCoins(TreeNode root) {
        if(root == null)
            return moves;
        dfs(root);
        return moves;
    }
    
    private int dfs(TreeNode root) {
        if(root == null)
            return 0;
        int extras = root.val - 1;
        extras += dfs(root.left);
        extras += dfs(root.right);
        moves += Math.abs(extras);
        return extras;
    }
}