class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int minv=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minv) minv=prices[i];
            else if((prices[i]-minv)>maxp) maxp=prices[i]-minv;
        }
        return maxp;
    }
}