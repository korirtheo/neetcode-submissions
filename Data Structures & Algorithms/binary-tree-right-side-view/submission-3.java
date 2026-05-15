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
    public List<Integer> ans = new ArrayList<Integer>();

    public void level(List<TreeNode> nodes) {
        List<TreeNode> nodes2 = new ArrayList<TreeNode>();
        int max = Integer.MIN_VALUE;

        for (TreeNode node : nodes) {
            max = Math.max(max, node.val);
            if (node.left != null) {
                nodes2.add(node.left);
                System.out.println(node.left.val);
            }
            if (node.right != null) {
                nodes2.add(node.right);
                System.out.println(node.right.val);
            }
        }
        ans.add(nodes.get(nodes.size() - 1).val);

        if (!nodes2.isEmpty()) {
            level(nodes2);
        }

        return;

    }
    public List<Integer> rightSideView(TreeNode root) {
        
        List<TreeNode> first = new ArrayList<TreeNode>();
        if(root == null) return ans;
        first.add(root);
        level(first);

        return ans;       
    }
}
