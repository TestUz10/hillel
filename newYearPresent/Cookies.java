package hanna_aleksieitseva.newYearPresent;

public class Cookies extends Sweets {
    private int weight = 2;

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
