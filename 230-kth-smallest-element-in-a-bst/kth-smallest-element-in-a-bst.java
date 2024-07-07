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
    static void inorder(TreeNode root, int[] count,int k,int[] kSmallest){
        if(root==null||count[0]>=k)return;
        inorder(root.left,count,k,kSmallest);
        count[0]++;
        if(count[0]==k){
            kSmallest[0]=root.val;
            return;
        }
        inorder(root.right,count,k,kSmallest);
    }
    public int kthSmallest(TreeNode root, int k) {
        int[] kSmallest = new int[]{Integer.MIN_VALUE};
        int[] count = new int[]{0};
        inorder(root, count, k, kSmallest);
        return kSmallest[0];
    }
}