public class ValidParentheses {
    public boolean isValid(String s) {
        boolean valid = false;
        for (int i = 0; i <s.length(); i++) {
            if(i+1<s.length()-1) {
                if(s.charAt(i) == '(' && s.charAt(i+1) == ')') {
                    valid = true;
                    i++;

                }
                else if(s.charAt(i) == '{' && s.charAt(i+1) == '}'){
                    valid = true;
                    i++;
                }
                else if (s.charAt(i) == '[' && s.charAt(i + 1) == ']') {
                    valid = true;
                    i++;
                }
                else valid = false;
            }
        }

        return valid;

    }

    public static void main(String[] args) {
        ValidParentheses valid = new ValidParentheses();
        String parent = "()";
        System.out.println(valid.isValid(parent));
    }
}
