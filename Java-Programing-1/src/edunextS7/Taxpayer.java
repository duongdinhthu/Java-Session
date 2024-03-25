package edunextS7;

public abstract class Taxpayer {
    private String id;

    public String getId() {
        return id;
    }
    public abstract double pay();

}
