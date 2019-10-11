package method_reference;

import java.util.Comparator;
import java.util.function.IntBinaryOperator;

// https://wedul.site/317
// https://www.javaguides.net/2018/07/java-8-method-references.html
// static wedulObject 클래스
class WedulObject {
    public static int staticMethod(int x, int y) {
        return x + y;
    }

    public int instanceMethod(int x, int y) {
        return x + y;
    }
}

public class Test1 {
    public static void main(String[] args) {

        IntBinaryOperator operator;

        operator = (x, y) -> WedulObject.staticMethod(x, y);
        System.out.println("class::staticMethod (람다) = " + operator.applyAsInt(1,2));

        operator = WedulObject::staticMethod;
        System.out.println( " class::staticMethod (메서드 레퍼런스) " + operator.applyAsInt(1, 2));

        WedulObject wedulObject = new WedulObject();
        operator = (x, y) -> wedulObject.instanceMethod(x, y);
        System.out.println("class::instanceMethod (람다 " + operator.applyAsInt(1, 2));

        operator = wedulObject::instanceMethod;
        System.out.println("class::instanceMethod (메서드 레퍼런스)" + operator.applyAsInt(1,3));




    }
}
