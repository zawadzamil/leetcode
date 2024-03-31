import java.util.*;

public class RandomizedSet {

    List<Integer> randomSet;

    public RandomizedSet() {
        this.randomSet = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (this.randomSet.contains(val)) return false;
        randomSet.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (this.randomSet.contains(val)) {
            this.randomSet.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        int randomIndex = new Random().nextInt(this.randomSet.size());

        int i = 0;
        for (Integer integer : this.randomSet) {
            if (i == randomIndex) {
                return integer;
            }
            i++;
        }

        return 0;
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();

        randomizedSet.insert(3);
        randomizedSet.insert(4);
        randomizedSet.insert(6);
        randomizedSet.insert(12);

        System.out.println(randomizedSet.insert(1));
        System.out.println(randomizedSet.remove(2));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(1));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());



    }

}
