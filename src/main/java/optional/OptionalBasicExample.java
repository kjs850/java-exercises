package optional;

import java.util.Optional;

public class OptionalBasicExample {

    // https://www.mkyong.com/java8/java-8-optional-in-depth/

    public static void main(String[] args) {

        Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("gender = " + gender);
        System.out.println("gender get = " + gender.get());
        System.out.println("empty optional = " + Optional.empty());

        System.out.println("answer1 = " + Optional.ofNullable(answer1));
        System.out.println("answer2 = " + Optional.ofNullable(answer2));

        //NullPointerException
        System.out.println(Optional.of(answer2));
    }
}
