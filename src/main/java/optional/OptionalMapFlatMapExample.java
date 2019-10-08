package optional;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    public static void main(String[] args) {

        Optional<String> nonEmptyGender = Optional.of("male");
        Optional<String> emptyGender = Optional.empty();

        System.out.println(nonEmptyGender.map(String::toUpperCase));
        System.out.println(emptyGender.map(String::toUpperCase));

        Optional<Optional<String>> nonEmptyOptionalGender = Optional.of(Optional.of("male"));
        System.out.println(nonEmptyOptionalGender);
        System.out.println(nonEmptyOptionalGender.map(gender -> gender.map(String::toUpperCase)));
        System.out.println(nonEmptyOptionalGender.flatMap(gender -> gender.map(String::toUpperCase)));
    }
}
