public class StockBuyAndSell{
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices){
        if (prices.length <= 1) {
            return 0;
        }
        
        // int minPrice = prices[0];
        // int maxProfit = 0;
        
        // for (int i = 1; i < prices.length; i++) {
        //     if (prices[i] < minPrice) {
        //         minPrice = prices[i];
        //     }
        //     int currentProfit = prices[i] - minPrice;
        //     if (currentProfit > maxProfit) {
        //         maxProfit = currentProfit;
        //     }
        // }

        // More simmpler way of doing this is
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices){
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        
        return maxProfit;
    }
}