package assignment_3;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Collections;

public class VectorDemo {

    public static void main(String[] args) {

        // =============================
        // VECTOR CONSTRUCTORS
        // =============================

        // 1. Default constructor
        Vector<String> v1 = new Vector<>();

        // 2. Constructor with initial capacity
        Vector<String> v2 = new Vector<>(5);

        // 3. Constructor with initial capacity and increment
        Vector<String> v3 = new Vector<>(3, 2);

        // 4. Constructor with another collection
        Vector<String> v4 = new Vector<>(v1);

        // =============================
        // VECTOR METHODS (15)
        // =============================

        // 1. add()
        v1.add("Java");
        v1.add("Python");
        v1.add("C++");

        // 2. addElement()
        v1.addElement("JavaScript");

        // 3. size()
        System.out.println("Size: " + v1.size());

        // 4. capacity()
        System.out.println("Capacity: " + v1.capacity());

        // 5. get()
        System.out.println("Element at index 1: " + v1.get(1));

        // 6. set()
        v1.set(1, "Kotlin");

        // 7. remove()
        v1.remove("C++");

        // 8. removeElementAt()
        v1.removeElementAt(0);

        // 9. contains()
        System.out.println("Contains Java: " + v1.contains("Java"));

        // 10. isEmpty()
        System.out.println("Is Vector empty: " + v1.isEmpty());

        // 11. firstElement()
        System.out.println("First Element: " + v1.firstElement());

        // 12. lastElement()
        System.out.println("Last Element: " + v1.lastElement());

        // 13. Enumeration
        System.out.println("Using Enumeration:");
        Enumeration<String> e = v1.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        // 14. sort() using Collections
        Collections.sort(v1);

        // 15. clear()
        v4.clear();

        // Final display
        System.out.println("Final Vector: " + v1);
    }
}
