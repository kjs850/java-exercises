package optional;

import java.util.Optional;

public class JavaGuides_2 {

    public static void main(String[] args) {

        // isPresent()
        Optional<String> empty = Optional.empty();
        System.out.println("empty = " + empty.isPresent()); //false

        // ifPresent()
        String name = "Ramesh";
        if (name != null) {
            System.out.println(name.length());
        }

        Optional<String> optional = Optional.of("Ramesh");
        optional.ifPresent(s -> System.out.println(s.length()));

        // orElse()
        String nullName = null;

        String optName = Optional.ofNullable(nullName).orElse("default");
        System.out.println(optName);

        //orElseGet()
        String orElseGet = Optional.ofNullable(nullName).orElseGet(() -> "get");
        System.out.println("orElseGet = " + orElseGet);

        //orElseThrow()
        String elseThrow = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
        System.out.println("elseThrow = " + elseThrow);


    }
}
