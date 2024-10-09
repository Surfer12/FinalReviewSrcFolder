package finalreviewsrcfoldercg;

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        Consumer<String> toUpperCase = s -> System.out.println(s.toUpperCase());

        Consumer<String> printThenUpperCase = print.andThen(toUpperCase);

        printThenUpperCase.accept("hello");
    }
}