class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int sellPrice=0;
        int minBuyPrice=prices[0];
        int maxProfit=0;
        for(int i=1; i<n; i++){
            if(minBuyPrice>prices[i]){
                minBuyPrice=prices[i];
            }
            sellPrice=prices[i];

            int profit=sellPrice-minBuyPrice;
            maxProfit=(profit>maxProfit)?profit:maxProfit;
        }
        return maxProfit;
    }
}