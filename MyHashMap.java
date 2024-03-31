import java.util.Map;

class MyHashMap {

    Map<Integer, Integer> myHashMap;

    public MyHashMap() {
        Map<Integer, Integer> myHashMap = Map.of();
    }

    public void put(int key, int value) {
        if (!this.myHashMap.containsKey(key)) {
            myHashMap.put(key, value);
        } else {
            myHashMap.replace(key, value);
        }
    }

    public int get(int key) {

        return myHashMap.get(key);

    }

    public void remove(int key) {

        myHashMap.remove(key);
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1,1);
        myHashMap.put(2,2);
        myHashMap.get(1);
        myHashMap.get(3);
    }
}