class Solution {
    public int romanToInt(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            switch(ch)
            {
                case 'M':
                ans+=1000;
                break;
                case 'D':
                ans+=500;
                break;
                case 'C':
                ans+=100;
                break;
                case 'L':
                ans+=50;
                break;
                case 'X':
                ans+=10;
                break;
                case 'V':
                ans+=5;
                break;
                case 'I':
                ans+=1;
                break;
            }
        }
        if(s.contains("IV")) ans=ans-2;
        if(s.contains("IX")) ans=ans-2;
        if(s.contains("XL")) ans=ans-20;
        if(s.contains("XC")) ans=ans-20;
        if(s.contains("CD")) ans=ans-200;
        if(s.contains("CM")) ans=ans-200;

        return ans;

    }
}