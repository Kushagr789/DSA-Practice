/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static void markParents(TreeNode root,Map<TreeNode,TreeNode> parents){
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.left!=null){
                parents.put(curr.left,curr);
                q.offer(curr.left);
            }
            if(curr.right!=null){
                parents.put(curr.right,curr);
                q.offer(curr.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parents=new HashMap<>();
        markParents(root,parents);
        Map<TreeNode,Boolean> visited=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(target);
        visited.put(target,true);
        
        while(!q.isEmpty()&&k>0){
            int size=q.size();
            
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null&&!visited.containsKey(curr.left)){
                    q.offer(curr.left);
                    visited.put(curr.left,true);
                }
                if(curr.right!=null&&!visited.containsKey(curr.right)){
                    q.offer(curr.right);
                    visited.put(curr.right,true);
                }
                if(parents.get(curr)!=null&&!visited.containsKey(parents.get(curr))){
                    q.offer(parents.get(curr));
                    visited.put(parents.get(curr),true);
                }
            }
            k--;
        }
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode node=q.poll();
            ans.add(node.val);
        }
       
        return ans;
    }
}