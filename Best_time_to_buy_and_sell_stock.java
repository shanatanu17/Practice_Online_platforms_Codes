public class Best_time_to_buy_and_sell_stock {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int mini = prices[0];         // mini--> stores the value of the day which has minimum cost upto current day
        int maxprofit = 0;
        


        for(int i= 1;i<n;i++)
        {
           int cost = prices[i] - mini;
           maxprofit = Math.max(maxprofit,cost);
           mini = Math.min(mini , prices[i]);
        }


        return maxprofit;
        
    }
}