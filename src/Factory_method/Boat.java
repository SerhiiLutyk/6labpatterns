package Factory_method;

public class Boat implements Transport {
    @Override
    public void move() {
        System.out.println("Sailing a boat.");
    }
}
