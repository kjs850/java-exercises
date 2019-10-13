package fn;

import java.util.function.BiConsumer;

public class BiConsumersExample {

    public static void main(String[] args) {

        BiConsumer<Person, Person> biConsumer = (p1, p2) ->{
            System.out.println("p1.getAge() = " + p1.getAge());
            System.out.println("p2.getAge() = " + p2.getAge());
        };

        biConsumer.accept(new Person("a",1), new Person("b", 2));


    }
}
