public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxPrice = 0;
       int rightPoint = 1;
       int leftPoint = 0;
       while(rightPoint < prices.length){
           if(prices[leftPoint] < prices[rightPoint]){
               maxPrice = Math.max(maxPrice, prices[rightPoint]-prices[leftPoint]);
           }
           else {
               leftPoint = rightPoint;
           }
           rightPoint++;

       }
        return maxPrice;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock object = new BestTimeToBuyAndSellStock();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(object.maxProfit(prices));
    }
}
