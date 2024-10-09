import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        BiFunction<String, String, String> concatAndUppercase = concat.andThen(String::toUpperCase);

        System.out.println(concatAndUppercase.apply("hello", "world"));
    }
}