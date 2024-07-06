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
    static TreeNode buildTree(int[] pre,int preS,int preE,int[] in,int inS,int inE,HashMap<Integer,Integer> map){
        if(preS>preE||inS>inE)
        return null;
        TreeNode root=new TreeNode(pre[preS]);
        int inRoot=map.get(root.val);
        int numsLeft=inRoot-inS;
        root.left=buildTree(pre,preS+1,preE+numsLeft,in,inS,inRoot-1,map);
        
        root.right=buildTree(pre,preS+numsLeft+1,preE,in,inRoot+1,inE,map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        map.put(inorder[i],i); 
        return buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
    }
}