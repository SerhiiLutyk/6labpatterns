import Factory_method.*;
import Strategy.*;
import Wrapper.*;
import execute_arround.*;

public class Main {
    public static void main(String[] args) {
        // --- Strategy ---
        System.out.println("=== Strategy ===");
        System.out.println(DeliveryStrategy.applyDelivery(100.0, DeliveryStrategy.truckDelivery));
        System.out.println(DeliveryStrategy.applyDelivery(100.0, DeliveryStrategy.droneDelivery));
        System.out.println(DeliveryStrategy.applyDelivery(100.0, DeliveryStrategy.bikeDelivery));

        // --- Factory ---
        System.out.println("\n=== Factory ===");
        Transport car = TransportFactory.createTransport(Car::new);
        Transport boat = TransportFactory.createTransport(Boat::new);
        Transport plane = TransportFactory.createTransport(Plane::new);
        car.move();
        boat.move();
        plane.move();

        // --- Decorator ---
        System.out.println("\n=== Decorator ===");
        System.out.println(IceCreamDecorator.createIceCream());

        // --- Execute Around ---
        System.out.println("\n=== Execute Around ===");
        Database.use(db -> db.op1().op2());
    }
}
