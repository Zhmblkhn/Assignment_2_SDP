package abstractfactories;

public class MercedesBody implements CarBody {
    private String type;

    public MercedesBody(String type) {
        this.type = type;
    }

    @Override
    public void showBodyInfo() {
        System.out.println("Mercedes body type: " + type);
    }
}
