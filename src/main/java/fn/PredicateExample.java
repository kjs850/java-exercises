package fn;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Person> predicate = person -> person.getAge() > 10;

        boolean result = predicate.test(new Person("aa", 12));

        System.out.println("result = " + result);
    }
}
