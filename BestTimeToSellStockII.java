public class BestTimeToSellStockII {
    public int maxProfit(int[] prices) {
        int maxPrice = 0;
        int rightPoint = 1;
        int leftPoint = 0;

        while (rightPoint < prices.length) {
            if (prices[leftPoint] <= prices[rightPoint]) {

                int currentProfit = prices[rightPoint] - prices[leftPoint];
                maxPrice = Math.max(maxPrice, currentProfit);
                int leftSecondIndex = rightPoint ;

                if (leftSecondIndex < prices.length - 1) {

                    int rightSecondIndex = leftSecondIndex + 1;

                    int secondMaxPrice = 0;

                    while (rightSecondIndex < prices.length) {

                        if (prices[leftSecondIndex] <= prices[rightSecondIndex]) {

                            secondMaxPrice = Math.max(secondMaxPrice, prices[rightSecondIndex] - prices[leftSecondIndex]);
                        } else {
                            leftSecondIndex = rightSecondIndex;
                        }
                        rightSecondIndex++;
                    }
                    maxPrice = Math.max(maxPrice, currentProfit + secondMaxPrice);

                }

            } else {
                leftPoint = rightPoint;
            }
            rightPoint++;

        }

        return maxPrice;
    }

    public static void main(String[] args) {
        BestTimeToSellStockII bestTimeToSellStockII = new BestTimeToSellStockII();
        int[] price = {3,3,5,0,0,3,1,4};
        System.out.println(bestTimeToSellStockII.maxProfit(price));
    }
}
