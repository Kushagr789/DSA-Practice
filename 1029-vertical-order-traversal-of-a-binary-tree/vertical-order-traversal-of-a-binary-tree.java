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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer,Map<Integer,List<Integer>>> map=new TreeMap<>();
        Queue<Pair<TreeNode,Pair<Integer,Integer>>> q=new LinkedList<>();
        q.add(new Pair<>(root,new Pair<>(0,0)));

        while(!q.isEmpty()){
            Pair<TreeNode,Pair<Integer,Integer>> temp=q.poll();
            TreeNode node=temp.getKey();
            int x=temp.getValue().getKey();
            int y=temp.getValue().getValue();
            map.computeIfAbsent(x, k -> new TreeMap<>())
                 .computeIfAbsent(y, k -> new ArrayList<>())
                 .add(node.val);

            if(node.left!=null)
            q.add(new Pair<>(node.left,new Pair(x-1,y+1)));
            if(node.right!=null)
            q.add(new Pair<>(node.right,new Pair(x+1,y+1)));
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(Map.Entry<Integer,Map<Integer,List<Integer>>> entry: map.entrySet()){
            List<Integer> col=new ArrayList<>();
            for(List<Integer> list: entry.getValue().values()){
                Collections.sort(list);
                col.addAll(list);
            }
            ans.add(col);
        }
        return ans;
    }
}