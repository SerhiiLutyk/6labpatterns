package Strategy;

import java.util.function.Function;

public class DeliveryStrategyExample {
    public static void main(String[] args) {
        Function<Double, String> truckDelivery = cost -> "Delivery by Truck: $" + (cost + 10);
        Function<Double, String> droneDelivery = cost -> "Delivery by Drone: $" + (cost + 25);
        Function<Double, String> bikeDelivery = cost -> "Delivery by Bike: $" + (cost + 5);

        System.out.println(applyDelivery(100.0, truckDelivery));
        System.out.println(applyDelivery(100.0, droneDelivery));
        System.out.println(applyDelivery(100.0, bikeDelivery));
    }

    public static String applyDelivery(Double baseCost, Function<Double, String> strategy) {
        return strategy.apply(baseCost);
    }
}
