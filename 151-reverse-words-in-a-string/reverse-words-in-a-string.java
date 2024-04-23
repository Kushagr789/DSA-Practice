class Solution {
    public String reverseWords(String s) {
        StringBuffer str=new StringBuffer(s.replaceAll("\\s+"," ").trim());
        
        String[] words=str.toString().split(" ");
        StringBuffer ans=new StringBuffer("");
        for(int i=words.length-1;i>=0;i--){
            ans.append(words[i].trim());
            if(i!=0)
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}