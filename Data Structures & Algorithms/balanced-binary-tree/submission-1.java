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


    public int heightMax(TreeNode node) {
        if (node == null) return 0;

        return 1 + Math.max(heightMax(node.left), heightMax(node.right)); 
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int left = heightMax(root.left);

        int right = heightMax(root.right);

        if(Math.abs(left - right) > 1) return false;

        return Math.abs(left - right) <=1 && isBalanced(root.left) && isBalanced(root.right);
        
    }
}
