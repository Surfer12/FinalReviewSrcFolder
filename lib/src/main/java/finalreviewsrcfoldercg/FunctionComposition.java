package finalreviewsrcfoldercg;

import java.util.function.Function;

public class FunctionComposition {
    public static void main(String[] args) {
        Function<Integer, Integer> times2 = x -> x * 2;
        Function<Integer, Integer> squared = x -> x * x;

        Function<Integer, Integer> composed = times2.andThen(squared);
        System.out.println(composed.apply(4));
    }
}