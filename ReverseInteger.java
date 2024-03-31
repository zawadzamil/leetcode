public class ReverseInteger {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();

        boolean isNegative = false;
        if (x < 0) {
            x = -x;
            isNegative = true;
        }
        sb.append(x);
        sb = sb.reverse();
        String intermediateString = sb.toString();
        int reversedNumber = 0;
        try {
            reversedNumber = Integer.parseInt(intermediateString);
        } catch (Exception e) {
            return 0;
        }

        reversedNumber = isNegative ? -reversedNumber : reversedNumber;
        return reversedNumber;
    }


    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(-123));
    }
}
