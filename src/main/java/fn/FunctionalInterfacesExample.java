package fn;

public class FunctionalInterfacesExample {

    public static void main(String[] args) {
        Sayable sayable = msg -> {
            System.out.println(msg);
        };

        sayable.say("hello");

    }
}
