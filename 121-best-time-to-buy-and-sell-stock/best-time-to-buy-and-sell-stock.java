class Solution {
    public int maxProfit(int[] prices) {
        int pro=0,price=prices[0];
        for(int i=1;i<prices.length;i++){
            price=Math.min(price,prices[i-1]);
            pro=Math.max(pro,prices[i]-price);
        }
        return pro;
    }
}