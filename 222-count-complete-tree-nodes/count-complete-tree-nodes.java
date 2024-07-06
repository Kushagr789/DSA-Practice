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
    static int findLeft(TreeNode root){
        int h=0;
        while(root!=null){
            h++;
            root=root.left;
        }
        return h;
    }
    static int findRight(TreeNode root){
        int h=0;
        while(root!=null){
            h++;
            root=root.right;
        }
        return h;
    }
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        int l=findLeft(root);
        int r=findRight(root);
        if(l==r)
        return (1<<l)-1;
        else{
            return 1+countNodes(root.left)+countNodes(root.right);
        }
    }
}