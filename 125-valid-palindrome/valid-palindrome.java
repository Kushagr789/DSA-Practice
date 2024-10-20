class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }
        String ans=str.toString();
        return ans.equals(str.reverse().toString());
    }
}