public class StringToInteger {
    public int myAtoi(String s) {
        s = s.trim();
        int n = 0;
        if(s.length() < 1) return 0;
        if(s.length()  == 1){
            if(!Character.isDigit(s.charAt(0))) return 0;
            return Integer.parseInt(s);
        }
        if (s.charAt(0) != '+' && s.charAt(0) != '-' && !Character.isDigit(s.charAt(0))) {
            return 0;
        }
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && !Character.isDigit(s.charAt(i))) {
                if (!Character.isDigit(s.charAt(i + 1))) {
                    return 0;
                }
                s2 += s.charAt(i);
                continue;
            }
            if (Character.isDigit(s.charAt(i))) {
                s2 += s.charAt(i);
            } else {
                break;
            }
        }
        try {
            n = Integer.parseInt(s2);
        } catch (NumberFormatException nf) {
            if (s.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }
        return n;
    }

    public static void main(String[] args) {
        StringToInteger result = new StringToInteger();
        System.out.println(result.myAtoi("1"));
    }
}
