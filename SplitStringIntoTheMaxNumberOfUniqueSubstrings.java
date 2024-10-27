import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Zawad Zamil
 * Date: 10/21/24
 * Time: 12:19 PM
 * Email: zawad@zaagsys.com
 */
public class SplitStringIntoTheMaxNumberOfUniqueSubstrings {

    public int maxUniqueSplit(String s) {
        List<String> list = new ArrayList<>();

        StringBuffer sb = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (!list.contains(c + "")) {
                list.add(sb.toString() + c);
                sb = new StringBuffer();
            } else {
                sb.append(c);
                if (!list.contains(sb.toString())) {
                    list.add(sb.toString());
                    sb = new StringBuffer();
                }
            }
        }

        List<String> secondList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (!secondList.contains(c + "")) {
                secondList.add( c + "");
            } else {
                String last = secondList.getLast();
                secondList.removeLast();
                secondList.add(last + c);
                if (!secondList.contains(sb.toString())) {
                    secondList.add(sb.toString());
                    sb = new StringBuffer();
                }
            }
        }
        System.out.println(secondList);
        return list.size();
    }

    public static void main(String[] args) {
        SplitStringIntoTheMaxNumberOfUniqueSubstrings substrings = new SplitStringIntoTheMaxNumberOfUniqueSubstrings();
        System.out.println(substrings.maxUniqueSplit("wwwzfvedwfvhsww"));
    }
}
