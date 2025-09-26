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
    public void flatten(TreeNode root) {
        backtrack(root);
    }

    private TreeNode backtrack(TreeNode root) {
        if (root == null) return null;
        TreeNode left = backtrack(root.left);
        TreeNode right = backtrack(root.right);
        if (left != null) {
            left.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        if (right != null) return right;
        if (left != null) return left;
        return root;
    }
}
