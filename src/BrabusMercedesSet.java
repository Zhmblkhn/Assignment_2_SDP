public class BrabusMercedesSet  implements MercedesFactory{

    public Brakes getBrakesOfMercedes() {
        return new BrabusBrakesOfMercedes();
    }

    public Engine getEngineOfMercedes() {
        return new BrabusEngineOfMercedes();
    }
}