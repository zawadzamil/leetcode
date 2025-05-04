/**
 * Created by IntelliJ IDEA.
 * User: Zawad Zamil
 * Date: 5/4/25
 * Time: 10:55 AM
 * Email: zawad@zaagsys.com
 */
public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        //Do your magic here
        if(names.length == 0) {
            return "no one likes this";
        } else if(names.length == 1) {
            return names[0] + " likes this";
        } else if(names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if(names.length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt("Peter", "John", "Mary"));
        System.out.println(whoLikesIt("Peter", "John"));
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter", "John", "Mary", "Alice"));
        System.out.println(whoLikesIt("Peter", "John", "Mary", "Alice", "Bob"));
    }
}
