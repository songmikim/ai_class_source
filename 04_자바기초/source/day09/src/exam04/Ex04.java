package exam04;

import java.util.function.Function;

public class Ex04 {
    public static void main(String[] args) {
        Function<String, String> func1 = x -> x;
        Function<String, String> func2 = Function.identity();

        String value= func2.apply("메세지");
        System.out.println(value);

    }
}
