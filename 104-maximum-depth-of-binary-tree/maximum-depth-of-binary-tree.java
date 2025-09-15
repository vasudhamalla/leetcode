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
    public int maxDepth(TreeNode root) {
    int c=1;
     return depth(root,c);
    }
    public int depth(TreeNode l1,int c){
        if(l1 == null) return c-1;
        return Math.max(depth(l1.left,c+1), depth(l1.right,c+1));
    }
}