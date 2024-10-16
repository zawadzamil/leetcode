import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.replace(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByKey());
        // Sort the list by values in ascending order
        entryList.sort((l1, l2) -> l2.getValue().compareTo(l1.getValue()));

        // Create a new LinkedHashMap to store the sorted entries
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        List<String> list = new ArrayList<>();
        AtomicInteger count = new AtomicInteger();
        sortedMap.forEach((s, integer) -> {
            if (count.get() < k) {
                list.add(s);
            }
            count.getAndIncrement();
        });

        return list;
    }

    public static void main(String[] args) {
        TopKFrequentWords t = new TopKFrequentWords();
        System.out.println(t.topKFrequent(new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"}, 4));

    }
}
