class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int MaxProfit=0;
        int min=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[min]){
                min=i;
            }
            else{
                profit=prices[i]-prices[min];
                MaxProfit=Math.max(profit,MaxProfit);
            }
        }
        
        return MaxProfit;
    }
}