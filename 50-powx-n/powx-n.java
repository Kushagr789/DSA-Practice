class Solution {
    public double myPow(double x, long n) {
        
        if(n==0)
        return 1;
        if(n<0)
        {
            x=1/x;
            n=-n;
        }
        double res=1;
        while(n>0){
            if(n%2==1){
                res*=x;
            }
            x*=x;
            n=n/2;
        }
        return res;
    }
}