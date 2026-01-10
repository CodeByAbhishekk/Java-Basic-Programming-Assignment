package assignment_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        // =============================
        // ArrayList CONSTRUCTORS
        // =============================

        // 1. Default constructor
        ArrayList<String> list1 = new ArrayList<>();

        // 2. Constructor with initial capacity
        ArrayList<String> list2 = new ArrayList<>(10);

        // 3. Constructor with another collection
        ArrayList<String> list3 = new ArrayList<>(list1);

        // =============================
        // ArrayList METHODS (15)
        // =============================

        // 1. add()
        list1.add("Java");
        list1.add("Python");
        list1.add("C++");

        // 2. add(index, element)
        list1.add(1, "JavaScript");

        // 3. size()
        System.out.println("Size: " + list1.size());

        // 4. get(index)
        System.out.println("Element at index 2: " + list1.get(2));

        // 5. set(index, element)
        list1.set(2, "C");

        // 6. remove(index)
        list1.remove(3);

        // 7. remove(Object)
        list1.remove("Python");

        // 8. contains()
        System.out.println("Contains Java: " + list1.contains("Java"));

        // 9. isEmpty()
        System.out.println("Is list empty: " + list1.isEmpty());

        // 10. iterator()
        System.out.println("Using Iterator:");
        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 11. addAll()
        list2.addAll(list1);

        // 12. clear()
        list3.clear();

        // 13. indexOf()
        System.out.println("Index of Java: " + list2.indexOf("Java"));

        // 14. sort() using Collections
        Collections.sort(list2);

        // 15. toArray()
        Object[] array = list2.toArray();
        System.out.println("Array Elements:");
        for (Object obj : array) {
            System.out.println(obj);
        }

        // Final display
        System.out.println("Final ArrayList: " + list2);
    }
}
