package assignment_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashMapDemo {

    public static void main(String[] args) {

        // =============================
        // HASHMAP CONSTRUCTORS
        // =============================

        // 1. Default constructor
        HashMap<Integer, String> map1 = new HashMap<>();

        // 2. Constructor with initial capacity
        HashMap<Integer, String> map2 = new HashMap<>(10);

        // 3. Constructor with initial capacity and load factor
        HashMap<Integer, String> map3 = new HashMap<>(16, 0.75f);

        // 4. Constructor with another Map
        HashMap<Integer, String> map4 = new HashMap<>(map1);

        // =============================
        // HASHMAP METHODS (15)
        // =============================

        // 1. put()
        map1.put(1, "Java");
        map1.put(2, "Python");
        map1.put(3, "C++");

        // 2. putIfAbsent()
        map1.putIfAbsent(4, "JavaScript");

        // 3. get()
        System.out.println("Value for key 2: " + map1.get(2));

        // 4. containsKey()
        System.out.println("Contains key 1: " + map1.containsKey(1));

        // 5. containsValue()
        System.out.println("Contains value Python: " + map1.containsValue("Python"));

        // 6. size()
        System.out.println("Size: " + map1.size());

        // 7. isEmpty()
        System.out.println("Is map empty: " + map1.isEmpty());

        // 8. keySet()
        Set<Integer> keys = map1.keySet();
        System.out.println("Keys: " + keys);

        // 9. values()
        Collection<String> values = map1.values();
        System.out.println("Values: " + values);

        // 10. entrySet()
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 11. remove(key)
        map1.remove(3);

        // 12. replace()
        map1.replace(2, "Kotlin");

        // 13. getOrDefault()
        System.out.println("Value for key 5: " + map1.getOrDefault(5, "Not Found"));

        // 14. putAll()
        map2.putAll(map1);

        // 15. clear()
        map4.clear();

        // Final display
        System.out.println("Final HashMap: " + map1);
    }
}
