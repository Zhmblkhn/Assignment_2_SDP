package abstractfactories;

public class BMWBody implements CarBody {
    private String type;

    public BMWBody(String type) {
        this.type = type;
    }

    @Override
    public void showBodyInfo() {
        System.out.println("BMW body type: " + type);
    }
}
