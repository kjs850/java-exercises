package treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetCaseInsensitiveExample {

    public static void main(String[] args) {
        SortedSet<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);

        // Now, lowercase elements will also be considered as duplicates
        fruits.add("banana");
        System.out.println("After adding \"banana\" : " + fruits);

    }
}
