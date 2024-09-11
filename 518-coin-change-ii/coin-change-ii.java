class Solution {
    public int change(int amount, int[] coins) {
        int[] prev=new int[amount+1];
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0)
                prev[i]=1;
        }

        for(int ind=1;ind<coins.length;ind++){
            int[] curr=new int[amount+1];
            for(int tar=0;tar<=amount;tar++){
                int notTake=prev[tar];
                int take=0;
                if(coins[ind]<=tar){
                    take=curr[tar-coins[ind]];
                }
                curr[tar]=take+notTake;
            }
            prev=curr;
        }
        return prev[amount];
    }
}