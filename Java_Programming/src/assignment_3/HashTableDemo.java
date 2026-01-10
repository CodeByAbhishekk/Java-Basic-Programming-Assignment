package assignment_3;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.Enumeration;

public class HashTableDemo {

    public static void main(String[] args) {

        // =============================
        // HASHTABLE CONSTRUCTORS
        // =============================

        // 1. Default constructor
        Hashtable<Integer, String> ht1 = new Hashtable<>();

        // 2. Constructor with initial capacity
        Hashtable<Integer, String> ht2 = new Hashtable<>(10);

        // 3. Constructor with initial capacity and load factor
        Hashtable<Integer, String> ht3 = new Hashtable<>(15, 0.75f);

        // 4. Constructor with another Map
        Hashtable<Integer, String> ht4 = new Hashtable<>(ht1);

        // =============================
        // HASHTABLE METHODS (15)
        // =============================

        // 1. put()
        ht1.put(1, "Java");
        ht1.put(2, "Python");
        ht1.put(3, "C++");

        // 2. putIfAbsent()
        ht1.putIfAbsent(4, "JavaScript");

        // 3. get()
        System.out.println("Value for key 2: " + ht1.get(2));

        // 4. containsKey()
        System.out.println("Contains key 1: " + ht1.containsKey(1));

        // 5. containsValue()
        System.out.println("Contains value Python: " + ht1.containsValue("Python"));

        // 6. size()
        System.out.println("Size: " + ht1.size());

        // 7. isEmpty()
        System.out.println("Is Hashtable empty: " + ht1.isEmpty());

        // 8. keySet()
        Set<Integer> keys = ht1.keySet();
        System.out.println("Keys: " + keys);

        // 9. values()
        Collection<String> values = ht1.values();
        System.out.println("Values: " + values);

        // 10. entrySet()
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : ht1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 11. remove()
        ht1.remove(3);

        // 12. replace()
        ht1.replace(2, "Kotlin");

        // 13. getOrDefault()
        System.out.println("Value for key 5: " + ht1.getOrDefault(5, "Not Found"));

        // 14. Enumeration of keys
        System.out.println("Using Enumeration:");
        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()) {
            Integer key = e.nextElement();
            System.out.println(key + " = " + ht1.get(key));
        }

        // 15. clear()
        ht4.clear();

        // Final display
        System.out.println("Final Hashtable: " + ht1);
    }
}
