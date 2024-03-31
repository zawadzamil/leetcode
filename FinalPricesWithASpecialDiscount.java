import java.util.Arrays;

public class FinalPricesWithASpecialDiscount {
    public int[] finalPrices(int[] prices) {


        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length - 1) {
                break;
            } else {
                int j = i + 1;
                while (j < prices.length) {
                    if (prices[j] <= prices[i]) {
                        prices[i] = prices[i] - prices[j];
                        break;
                    }
                    j++;
                }
            }
        }
        return prices;
    }

    public static void main(String[] args) {
        FinalPricesWithASpecialDiscount finalPricesWithASpecialDiscount = new FinalPricesWithASpecialDiscount();
        int[] prices = {8,4,6,2,3};
        System.out.println(Arrays.toString(finalPricesWithASpecialDiscount.finalPrices(prices)));
    }
}
