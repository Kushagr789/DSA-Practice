class Solution {
    public int myAtoi(String s) {
        int p=1,i=0,ans=0;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        if(s.length()==0)
        return 0;
        while(i<s.length()&& s.charAt(i)==' ')
        i++;

        if(i<s.length()&& (s.charAt(i)=='-'||s.charAt(i)=='+'))
        {
            if(s.charAt(i)=='-')
            p=-1;
            else
            p=1;
            i++;
        }

        while(i<s.length()&&s.charAt(i)-'0'<=9&&s.charAt(i)-'0'>=0)
        {
            int d=s.charAt(i)-'0';
            if(ans>max/10 || (ans==max/10 && d>max%10)){
                return (p == 1) ? max : min;            
            }
            ans=ans*10+d;
            i++;
        }
        return ans*p;
    }
}