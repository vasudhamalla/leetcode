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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        backtrack(p, l1);
        backtrack(q, l2);
        return l1.equals(l2);
    }

    public void backtrack(TreeNode node, List<String> list) {
        if (node == null) {
            list.add("null");
            return;
        }
        list.add(String.valueOf(node.val));
        backtrack(node.left, list);
        backtrack(node.right, list);
    }
}
