class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        int left =0;
        int right = 1;
        while(right<prices.length){
            int profit=0;
            if(prices[left]>prices[right]){
                left = right;
            } else{
                profit= prices[right]-prices[left];
                maxProfit = Math.max(profit,maxProfit);
            }
            right++;
        }
        return maxProfit;
    }
}
