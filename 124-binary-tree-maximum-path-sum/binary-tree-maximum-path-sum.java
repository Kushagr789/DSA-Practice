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
    public static int findSum(TreeNode root,int[] sum){
        if(root==null)return 0;
        int lft=Math.max(0,findSum(root.left,sum));
        int rt=Math.max(0,findSum(root.right,sum));
        sum[0]=Math.max(sum[0],lft+rt+root.val);
        return Math.max(lft,rt)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        int[] sum=new int[1];
        sum[0]=Integer.MIN_VALUE;
        findSum(root,sum);
        return sum[0];
    }
}