package assignment_3;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class TreeMapDemo {

    public static void main(String[] args) {

        // =============================
        // TREEMAP CONSTRUCTORS
        // =============================

        // 1. Default constructor (natural ordering)
        TreeMap<Integer, String> map1 = new TreeMap<>();

        // 2. Constructor with another Map
        TreeMap<Integer, String> map2 = new TreeMap<>(map1);

        // 3. Constructor with SortedMap
        TreeMap<Integer, String> map3 = new TreeMap<>(map1);

        // 4. Constructor with Comparator (reverse order)
        TreeMap<Integer, String> map4 = new TreeMap<>((a, b) -> b - a);

        // =============================
        // TREEMAP METHODS (15)
        // =============================

        // 1. put()
        map1.put(101, "Java");
        map1.put(103, "Python");
        map1.put(102, "C++");

        // 2. putIfAbsent()
        map1.putIfAbsent(104, "JavaScript");

        // 3. get()
        System.out.println("Value for key 102: " + map1.get(102));

        // 4. containsKey()
        System.out.println("Contains key 101: " + map1.containsKey(101));

        // 5. containsValue()
        System.out.println("Contains value Python: " + map1.containsValue("Python"));

        // 6. size()
        System.out.println("Size: " + map1.size());

        // 7. isEmpty()
        System.out.println("Is TreeMap empty: " + map1.isEmpty());

        // 8. keySet()
        Set<Integer> keys = map1.keySet();
        System.out.println("Keys: " + keys);

        // 9. values()
        Collection<String> values = map1.values();
        System.out.println("Values: " + values);

        // 10. entrySet()
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 11. firstKey()
        System.out.println("First Key: " + map1.firstKey());

        // 12. lastKey()
        System.out.println("Last Key: " + map1.lastKey());

        // 13. higherKey()
        System.out.println("Higher key than 101: " + map1.higherKey(101));

        // 14. lowerKey()
        System.out.println("Lower key than 103: " + map1.lowerKey(103));

        // 15. remove()
        map1.remove(102);

        // Final display
        System.out.println("Final TreeMap: " + map1);
    }
}
