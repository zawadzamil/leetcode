import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class GenerateParentheses {
    Stack<String> stack = new Stack<>();
    List<String> result = new ArrayList<>();

    void browseParentheses(int opening, int closing, int n) {
        if ((opening == n) && (closing == n)) {
            result.add(String.join("", stack));
        } else {
            if (opening < n) {
                stack.push("(");
                browseParentheses(opening + 1, closing, n);
                stack.pop();
            }
            if (closing < opening) {
                stack.push(")");
                browseParentheses(opening, closing + 1, n);
                stack.pop();
            }
        }

    }

    public List<String> generateParenthesis(int n) {

        browseParentheses(0, 0, n);
        return result;
    }

    public static void main(String[] args) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        System.out.println(generateParentheses.generateParenthesis(3));
    }
}
