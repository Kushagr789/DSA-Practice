class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int x=0,y=0;
        while(y<s.length&&x<g.length){
            if(g[x]<=s[y]){
                x++;
            }
            y++;
        }
        return x;
    }
}