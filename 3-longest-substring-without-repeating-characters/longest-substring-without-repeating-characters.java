class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0,r=0;
        Set<Character> str=new HashSet<>();
        int maxlen=0;
        while(r<n){
            char ch=s.charAt(r);
            if(str.contains(ch)){
                while(l<r&&str.contains(ch)){
                    str.remove(s.charAt(l));
                    l++;
                }
            }
            str.add(ch);
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}