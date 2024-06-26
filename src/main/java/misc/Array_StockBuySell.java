package misc;

public class Array_StockBuySell {

    public static void main(String[] args) {
        int[] prices = new int[]{3,1,4,8,7,9,5};
        System.out.println("Max Profit: "+maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minPriceTillNow = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPriceTillNow) {
                minPriceTillNow = prices[i];
            }
            if ((prices[i] - minPriceTillNow) > maxProfit) {
                maxProfit = prices[i] - minPriceTillNow;
            }
        }
        return maxProfit;
    }

}
