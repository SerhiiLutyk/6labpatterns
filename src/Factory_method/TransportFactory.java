package Factory_method;

import java.util.function.Supplier;

public class TransportFactory {
    public static Transport createTransport(Supplier<Transport> factory) {
        return factory.get();
    }
}
