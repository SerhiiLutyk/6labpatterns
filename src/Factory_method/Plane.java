package Factory_method;

public class Plane implements Transport {
    @Override
    public void move() {
        System.out.println("Flying a plane.");
    }
}
