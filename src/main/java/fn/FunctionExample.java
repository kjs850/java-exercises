package fn;


import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        // convert centigrade to fahrenheit
        Function< Integer, Double > centigradeToFahrenheitInt = x -> new Double((x * 9 / 5) + 32);


        // String to an integer
        Function<String, Integer> stringToInt2 = x -> Integer.valueOf(x);
        System.out.println(stringToInt2.apply("2"));


        Function<PersonEntity, PersonDTO> function = entity -> new PersonDTO(entity.getName(), entity.getAge());
        PersonDTO aaa = function.apply(new PersonEntity("aaa", 12));
        System.out.println("aaa.getName() = " + aaa.getName());
        System.out.println("aaa.getAge() = " + aaa.getAge());

    }
}

class PersonEntity {
    private String name;
    private int age;

    public PersonEntity(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class PersonDTO {
    private String name;
    private int age;

    public PersonDTO(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}