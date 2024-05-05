class Solution {
    static long pow(long p, long q){
        if(q==0)return 1;
        long sp=pow(p,q/2);

        if(q%2==0)
        return ((sp%mod)*(sp%mod))%mod;
        else
        return (p*(sp%mod)*(sp%mod))%mod;
    }
    public static int mod=1000000007;
    public int countGoodNumbers(long n) {
        long a=pow(5,(n+1)/2)%mod;
        long b=pow(4,n/2)%mod;
        return (int)((a*b)%mod);

    }
}