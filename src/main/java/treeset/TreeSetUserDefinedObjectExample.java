package treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetUserDefinedObjectExample {

    public static void main(String[] args){
        SortedSet<Employee> employees = new TreeSet<>();

        // TreeSet uses the compareTo() method of the Employee class to compare two employees and sort them
        employees.add(new Employee(1010, "Rajeev"));
        employees.add(new Employee(1005, "Sachin"));
        employees.add(new Employee(1008, "Chris"));

        System.out.println("Employees (sorted based on Employee class's compareTo() function)");
        System.out.println(employees);

        employees = new TreeSet<>(Comparator.comparing(Employee::getName));

        employees.add(new Employee(1010, "Rajeev"));
        employees.add(new Employee(1005, "Sachin"));
        employees.add(new Employee(1008, "Chris"));

        System.out.println("\nEmployees (sorted based on the supplied Comparator)");
        System.out.println(employees);


    }
}
