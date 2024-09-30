import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {
    private final int capacity;
    private final Map<K, V> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity; // 캐시의 크기를 초과하면 가장 오래된 항목을 제거
            }
        };
    }

    // 캐시에 접근하는 메서드
    public V get(K key) {
        return cache.getOrDefault(key, null); // 키가 존재하면 반환, 없으면 null
    }

    // 캐시에 데이터를 삽입하는 메서드
    public void put(K key, V value) {
        cache.put(key, value); // 데이터를 캐시에 삽입
    }

    // 캐시 내용을 출력하는 메서드
    public void displayCache() {
        System.out.println("Current Cache: " + cache);
    }

    public static void main(String[] args) {
        LRUCache<String, String> lruCache = new LRUCache<>(3); // 캐시 크기 3으로 설정

        lruCache.put("A", "Apple");
        lruCache.put("B", "Banana");
        lruCache.put("C", "Cherry");
        lruCache.displayCache(); // 현재 캐시: {A=Apple, B=Banana, C=Cherry}

        lruCache.get("A"); // "A"를 접근 (가장 최근에 사용)
        lruCache.put("D", "Durian"); // 새로운 항목 추가 (LRU인 B가 제거됨)
        lruCache.displayCache(); // 현재 캐시: {C=Cherry, A=Apple, D=Durian}

        lruCache.put("E", "Elderberry"); // 새로운 항목 추가 (LRU인 C가 제거됨)
        lruCache.displayCache(); // 현재 캐시: {A=Apple, D=Durian, E=Elderberry}
    }
}
