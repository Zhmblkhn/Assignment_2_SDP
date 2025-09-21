package abstractfactories;

public class BodyTypeChecking {
    public static void checkingBMWBody(String type) {
        if (type.equalsIgnoreCase("Sedan") ||
                type.equalsIgnoreCase("SUV") ||
                type.equalsIgnoreCase("Coupe")) {
            return; // OK
        }
        throw new IllegalArgumentException("BMW does not support body type: " + type);
    }

    public static void checkingMercedesBody(String type) {
        if (type.equalsIgnoreCase("Sedan") ||
                type.equalsIgnoreCase("Cabriolet") ||
                type.equalsIgnoreCase("SUV")) {
            return; // OK
        }
        throw new IllegalArgumentException("Mercedes does not support body type: " + type);
    }
}

