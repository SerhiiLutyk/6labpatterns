package Wrapper;

import java.util.function.Function;

public class IceCreamDecoratorExample {
    public static void main(String[] args) {
        Function<String, String> base = s -> "Basic Ice Cream";

        Function<String, String> withChocolate = s -> s + " + Chocolate Topping";
        Function<String, String> withNuts = s -> s + " + Nuts";
        Function<String, String> withTwoScoops = s -> s + " + 2 Scoops";

        Function<String, String> decorated = base
                .andThen(withTwoScoops)
                .andThen(withChocolate)
                .andThen(withNuts);

        System.out.println(decorated.apply(""));
    }
}
