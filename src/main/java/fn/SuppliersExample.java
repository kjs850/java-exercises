package fn;

import java.util.function.Supplier;

public class SuppliersExample {

    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person("bb",10);
        Person p = supplier.get();

        System.out.println("Person Detail:\n" + p.getName() + ", " + p.getAge());

    }
}
