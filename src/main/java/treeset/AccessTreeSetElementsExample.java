package treeset;

import java.util.TreeSet;

public class AccessTreeSetElementsExample {

    // https://www.callicoder.com/java-treeset/
    public static void main(String[] args) {
        TreeSet<String> students = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        students.add("Julia");
        students.add("Robert");
        students.add("Mark");
        students.add("Steven");

        System.out.println("Students TreeSet : " + students);

        System.out.println("size: " + students.size());


        // Check if an element exists in the TreeSet
        String name = "Julia";
        if (students.contains(name)) {
            System.out.println("TreeSet contains the element : " + name);
        }else{
            System.out.println("TreeSet does not contain the element : " + name);
        }

        System.out.println("first element: " + students.first());
        System.out.println("last element: " + students.last());

        name = "Robert";
        System.out.println("Element just greater than "  + name + " : " + students.higher(name));
        System.out.println("Element just lower than "  + name + " : " + students.lower(name));





    }
}
