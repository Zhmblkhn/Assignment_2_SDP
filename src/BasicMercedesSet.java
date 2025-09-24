public class BasicMercedesSet implements MercedesFactory{

    public Brakes getBrakesOfMercedes() {
        return new BasicBrakesOfMercedes();
    }

    public Engine getEngineOfMercedes() {
        return new BasicEngineOfMercedes();
    }

}

