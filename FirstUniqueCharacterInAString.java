import java.util.ArrayList;
import java.util.List;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        List<Character> list = new ArrayList<>();
        List<Character> duplicate = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if (list.contains(s.charAt(i))) {
                list.remove(list.indexOf(s.charAt(i)));
                duplicate.add(s.charAt(i));
            }else{
                if(!duplicate.contains(s.charAt(i))){
                    list.add(s.charAt(i));
                }
            }

        }


        if(!list.isEmpty()){
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == list.get(0)){
                    return i;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        FirstUniqueCharacterInAString f = new FirstUniqueCharacterInAString();
        System.out.println(f.firstUniqChar("aadadaad"));
    }
}
