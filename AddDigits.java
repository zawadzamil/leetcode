public class AddDigits {
    public int addDigits(int num) {
        while (num  >= 10) {
            int numCopy = num;
            int sum = 0;
            while (numCopy > 0) {
                sum += numCopy % 10;
                numCopy /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        System.out.println(addDigits.addDigits(38));
    }

}
