public  class Main {
    public static void main(String[] args) {
        // Fabric pattern - solve the problem of creating objects of any type with one method, which returns type that depends of logic which described in method.
        BasicMercedesSet basicmercedes = new BasicMercedesSet();
        BrabusMercedesSet brabusmercedes = new BrabusMercedesSet();
        System.out.println(doMercedes(brabusmercedes));
    }

    public static String doMercedes(MercedesFactory mercedesFactory) {
        return mercedesFactory.getBrakesOfMercedes().getName() + " " + mercedesFactory.getEngineOfMercedes().getName();
    }
}