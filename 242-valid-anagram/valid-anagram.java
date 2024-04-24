class Solution {
    public boolean isAnagram(String s, String t) {
        int c[] =new int[26];
        for(int i=0;i<26;i++)
        c[i]=-1;
        for(int i=0;i<s.length();i++)
        {
            c[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            if(c[(int)(t.charAt(i)-'a')]==-1)
            return false;
            else
            c[(int)(t.charAt(i)-'a')]--;
        } 
        for(int i=0;i<26;i++){
            if(c[i]!=-1)
            return false;
        }
        return true;
    }
}