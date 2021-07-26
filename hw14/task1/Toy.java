package hanna_aleksieitseva.hw14.task1;

import java.util.Objects;

public abstract class Toy {
    protected String material;
    protected String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Toy toy = (Toy) o;

        if (!Objects.equals(material, toy.material)) return false;
        return Objects.equals(color, toy.color);
    }

    @Override
    public int hashCode() {
        int result = material != null ? material.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
