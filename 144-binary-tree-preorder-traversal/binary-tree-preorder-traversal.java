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
    public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> l1 = new ArrayList<>();
            return backTrack(root,l1);
    }
    public List<Integer> backTrack(TreeNode root, List<Integer> l1){
        if(root == null) return l1;
        if(root!=null) l1.add(root.val);
        backTrack(root.left, l1); 
        backTrack(root.right, l1);
        return l1;  
    }

}