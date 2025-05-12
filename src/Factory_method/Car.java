package Factory_method;

public class Car implements Transport {
    @Override
    public void move() {
        System.out.println("Driving a car.");
    }
}
