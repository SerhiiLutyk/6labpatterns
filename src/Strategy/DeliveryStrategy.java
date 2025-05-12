package Strategy;

import java.util.function.Function;

public class DeliveryStrategy {
    // Стратегії доставки
    public static final Function<Double, String> truckDelivery = cost -> "Truck delivery cost: " + (cost + 10);
    public static final Function<Double, String> droneDelivery = cost -> "Drone delivery cost: " + (cost + 20);
    public static final Function<Double, String> bikeDelivery = cost -> "Bike delivery cost: " + (cost + 5);

    public static void main(String[] args) {
        System.out.println("=== Strategy ===");
        System.out.println(applyDelivery(100.0, truckDelivery));
        System.out.println(applyDelivery(100.0, droneDelivery));
        System.out.println(applyDelivery(100.0, bikeDelivery));
    }

    public static String applyDelivery(Double baseCost, Function<Double, String> strategy) {
        return strategy.apply(baseCost);
    }
}
