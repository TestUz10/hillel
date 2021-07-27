package hanna_aleksieitseva.hw14.task1;

public abstract class Animal {
    protected int weight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return weight == animal.weight;
    }

    @Override
    public int hashCode() {
        return weight;
    }
}
