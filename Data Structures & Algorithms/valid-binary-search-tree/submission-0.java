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

    List<Integer> vals = new ArrayList<Integer>();

    public void helper(TreeNode root) {

        if (root == null) return;

        helper(root.left);

        vals.add(root.val);


        helper(root.right);

    }
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        helper(root);

        for(int i =0; i <vals.size() -1; i++) {
            if (vals.get(i) >= vals.get(i + 1)) return false;
        }

        return true;       
    }
}
