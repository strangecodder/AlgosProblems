public class Num123 {

    public int maxProfit(int[] prices) {
        int maxBuy = prices[0];
        int index =0;
        int profit = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<maxBuy){
                maxBuy=prices[i];
                index = i;
            }
        }
        for(int i = index; i<prices.length;i++){
            if(prices[i]-maxBuy>profit){
                profit = prices[i]-maxBuy;
            }
        }
        if(profit == Integer.MAX_VALUE){
            return 0;
        }else {
            return profit;
        }
    }

    public static void main(String[] args) {

    }
}
