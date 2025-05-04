/**
 * Created by IntelliJ IDEA.
 * User: Zawad Zamil
 * Date: 11/3/24
 * Time: 5:07 PM
 * Email: zawad@zaagsys.com
 */
public class RotateString {
    public boolean rotateString(String s, String goal) {

        if (s.equals(goal)) return true;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < goal.length(); i++) {
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            if (sb.toString().equals(goal)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        RotateString rotateString = new RotateString();
        System.out.println(rotateString.rotateString("abced", "cedab"));
    }
}
