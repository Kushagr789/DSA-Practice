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
    static TreeNode buildTree(int[] in, int inStart, int inEnd, int[] po, int poStart, int poEnd, Map<Integer,Integer> inMap) {
        if(inStart > inEnd || poStart > poEnd) return null;

        TreeNode root = new TreeNode(po[poEnd]);
        
        int rootIdx = inMap.get(po[poEnd]);
        
        int numsLeft = rootIdx - inStart;

        root.left = buildTree(in, inStart, rootIdx - 1, po, poStart, poStart + numsLeft - 1, inMap);

        root.right = buildTree(in, rootIdx + 1, inEnd, po, poStart + numsLeft, poEnd - 1, inMap);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length!=postorder.length)return null;
        HashMap <Integer,Integer> inMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        inMap.put(inorder[i],i); 
        return buildTree(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, inMap);

    }
}