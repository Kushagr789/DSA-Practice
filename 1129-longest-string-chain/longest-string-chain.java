class Solution {
    static Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();

    static boolean compare(String s1,String s2){
        if (s1.length() != s2.length() + 1) {
            return false;
        }

        int first = 0;
        int second = 0;

        while (first < s1.length()) {
            if (second < s2.length() && s1.charAt(first) == s2.charAt(second)) {
                first++;
                second++;
            } else {
                first++;
            }
        }

        return first == s1.length() && second == s2.length();
    }
    public int longestStrChain(String[] words) {
        int n=words.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int max=1;
        Arrays.sort(words,comp);
        for(int i=0;i<n;i++){
            for(int prev=0;prev<i;prev++){
                if(compare(words[i],words[prev])&&dp[prev]+1>dp[i]){
                    dp[i]=1+dp[prev];
                }
            }
            if(dp[i]>max){
                max=dp[i];
                
            }
        }
        return max;
    }
}