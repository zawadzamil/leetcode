public class Test {
    public static void main(String[] args) {
        double totalPrice = (3.99 * 3);
        double taxPercentage = 50.0 ;
        double taxAmount = (totalPrice * taxPercentage) / 100;
        double finalPrice = totalPrice + taxAmount;

        System.out.printf("Total price : %f, \n Tax Percentage : %f  \n Tax Amount : %f \n Final Price : %f%n", totalPrice, taxPercentage, taxAmount, finalPrice);
    }
}
