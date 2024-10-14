public class PercentageOfLetterInString {

    public int percentageLetter(String s, char letter) {
        int count = 0;
        for(char c : s.toCharArray()){
            if(letter == c) count++;
        }
        return count * 100 / s.length();
    }

    public static void main(String[] args) {
        PercentageOfLetterInString p = new PercentageOfLetterInString();
        System.out.println(p.percentageLetter("jjjj", 'k'));
    }
}
