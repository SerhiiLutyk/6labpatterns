package Wrapper;

import java.util.function.Function;

public class IceCreamDecorator {
    public static String createIceCream() {
        Function<String, String> base = s -> "Basic Ice Cream";
        Function<String, String> withScoops = s -> s + " + 2 Scoops";
        Function<String, String> withChocolate = s -> s + " + Chocolate Topping";
        Function<String, String> withNuts = s -> s + " + Nuts";

        Function<String, String> decorated = base
                .andThen(withScoops)
                .andThen(withChocolate)
                .andThen(withNuts);

        return decorated.apply("");
    }
}
