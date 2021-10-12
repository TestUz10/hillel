package hanna_aleksieitseva.newYearPresent;

public class Sweets {
    protected String name;
    protected int weight;
    protected boolean expirationDateIsLeft;

    public Sweets() {
        name = "Unknown";
        weight = 0;
        expirationDateIsLeft = false;
    }

    public Sweets(String name, int weight, boolean expirationDateIsLeft) {
        this.name = name;
        this.weight = weight;
        this.expirationDateIsLeft = expirationDateIsLeft;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":{name='" + name +
                ", weight=" + weight +
                ", expirationDateIsLeft=" + expirationDateIsLeft
                + '}';
    }
}
