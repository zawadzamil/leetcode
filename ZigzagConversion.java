public class ZigzagConversion {
    public void convert(String s, int numRows) {
        int last = s.length();
        int i = 0;
        while (last > 0) {
            System.out.println(s.charAt(i));
            i++;
            last -= 1;
        }
    }

    public static void main(String[] args) {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        zigzagConversion.convert("PAHNAPLSIIGYIR",3);
    }
}
