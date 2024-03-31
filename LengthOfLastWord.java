import java.util.Arrays;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int i=0;
        s=s.trim();
        int j = s.length()-1;
        while(j >= 0){
            if(s.charAt(j) == ' ') break;
            i++;
            j--;

        }
        return i;
    }

    public static void main(String[] args) {
        LengthOfLastWord obj = new LengthOfLastWord();
        String s = "   fly me   to   the moon  ";

        System.out.println(obj.lengthOfLastWord(s));
    }

}
