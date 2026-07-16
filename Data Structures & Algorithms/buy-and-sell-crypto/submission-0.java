class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minBuy = prices[0];
        for(int num : prices)
        {
            maxP = Math.max(maxP, num-minBuy);
            minBuy = Math.min(minBuy, num);
        }
        return maxP;
    }
}
