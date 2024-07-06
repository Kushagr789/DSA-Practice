/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        StringBuilder s=new StringBuilder();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node==null)
            s.append("#,");
            else{
                s.append(node.val).append(",");
                q.offer(node.left);
                q.offer(node.right);
            }
        }
        return s.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty())return null;
        StringBuilder s=new StringBuilder(data);
        int commaInd=s.indexOf(",");
        String str=s.substring(0,commaInd);
        s.delete(0,commaInd+1);
        TreeNode root=new TreeNode(Integer.parseInt(str));
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            commaInd = s.indexOf(",");
            str = s.substring(0, commaInd);
            s.delete(0, commaInd + 1);
            if (!str.equals("#")) {
                TreeNode left = new TreeNode(Integer.parseInt(str));
                node.left = left;
                q.offer(left);
            }
            commaInd = s.indexOf(",");
            str = s.substring(0, commaInd);
            s.delete(0, commaInd + 1);
            if (!str.equals("#")) {
                TreeNode right = new TreeNode(Integer.parseInt(str));
                node.right = right;
                q.offer(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));