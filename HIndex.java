import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {

        if (citations.length == 1) {
            if (citations[0] > 0) {
                return 1;
            }
            return 0;
        }

        Arrays.sort(citations);
        int countFori = citations.length;
        for (int i = citations.length - 1; i >= 0; i--) {

            int count = 0;
            for (int citation : citations) {
                if ( citation >= countFori) {
                    count++;
                }
            }
            if (count >= countFori) {
                return countFori;
            }
            countFori--;
        }

        return 0;
    }


    public static void main(String[] args) {
        HIndex hIndex = new HIndex();

        int[] values = {3,0,6,1,5};

        System.out.println(hIndex.hIndex(values));
    }

}
