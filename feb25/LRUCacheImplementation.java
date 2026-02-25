import java.util.*;

class LRUCache {
    private final int capacity;
    private LinkedHashMap<Integer,Integer> map;

    public LRUCache(int capacity){
        this.capacity = capacity;
        map = new LinkedHashMap<>(capacity,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry eldest){
                return size() > capacity;
            }
        };
    }

    public int get(int key){
        return map.getOrDefault(key,-1);
    }

    public void put(int key,int value){
        map.put(key,value);
    }
}

public class LRUCacheImplementation {
    public static void main(String[] args){
        LRUCache cache = new LRUCache(2);
        cache.put(1,1);
        cache.put(2,2);
        System.out.println(cache.get(1));
        cache.put(3,3);
        System.out.println(cache.get(2));
    }
}