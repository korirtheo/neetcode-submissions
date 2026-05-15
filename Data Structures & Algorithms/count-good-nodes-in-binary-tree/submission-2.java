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

    int ans = 0;

    public void check(TreeNode root, int max) {

        if (root.left != null) {
            if (max <= root.left.val) {
                ans++;
                check(root.left, root.left.val);
            }
            else {
                check(root.left, max);
            }
            
        }
        if (root.right != null) {
            if (max <= root.right.val) {
                ans++;
                check(root.right, root.right.val);
            }
            else {
                check(root.right, max);
            }
            
        }
    }

    public int goodNodes(TreeNode root) {
        check(root, root.val);
        return ans + 1;
    }
}
