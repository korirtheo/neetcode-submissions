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
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public void children (List<TreeNode> nodes) {
        List<Integer> childs = new ArrayList<Integer> ();
        List<TreeNode> nodes2 = new ArrayList<TreeNode> ();

        for(TreeNode node : nodes) {
            childs.add(node.val);

            if(node.left != null) {
                nodes2.add(node.left);
            }
            if(node.right != null) {
                nodes2.add(node.right);
            }
        }
        ans.add(childs);
        if (nodes2.size() != 0) {
            children(nodes2);
        }

        return;

    }



    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return ans;
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        nodes.add(root);
        children(nodes);
        return ans;
        
    }
}
