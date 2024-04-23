class Solution {
    public String reverseWords(String s) {
       String[] words=s.split("\\s+");
       StringBuffer ans=new StringBuffer("");
       for(int i=words.length-1;i>=0;i--)
       {
        ans.append(words[i]).append(" ");
       }
       return ans.toString().trim();
    }
}