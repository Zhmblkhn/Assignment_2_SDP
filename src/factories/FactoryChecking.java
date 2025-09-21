package factories;

public class FactoryChecking {
    public static CarFactory getCarFactory(String model) {
        if (model.equalsIgnoreCase("Mercedes")) {
            return new MercedesFactory();
        } else if (model.equalsIgnoreCase("BMW")) {
            return new BMWFactory();
        } else {
            throw new RuntimeException(model + " is unknown");
        }
    }
}
