import java.util.*;

public class SortCharactersByFrequency {

    public String frequencySort(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (hashMap.containsKey(c)) {
                hashMap.replace(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        // Sort the list by values in ascending order
        entryList.sort(Map.Entry.comparingByValue());

        // Create a new LinkedHashMap to store the sorted entries
        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        StringBuffer sc = new StringBuffer();
        sortedMap.forEach((character, integer) -> {
            for (int i = 0; i < integer; i++) {
                sc.append(character);
            }
        });
        return sc.reverse().toString();
    }

    public static void main(String[] args) {

        SortCharactersByFrequency sortCharactersByFrequency = new SortCharactersByFrequency();
        System.out.println(sortCharactersByFrequency.frequencySort("tree"));

    }
}
