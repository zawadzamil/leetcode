import java.util.Arrays;

public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        for (int i = piles[0]; i <= piles[piles.length - 1]; i++) {
            int sum = 0;
            for (int pile : piles) {
                sum += pile / i;
            }

            System.out.println(sum);

            if (sum <= h) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();
        int[] piles = {30,11,23,4,20};
        System.out.println(kokoEatingBananas.minEatingSpeed(piles, 6));
    }

}
