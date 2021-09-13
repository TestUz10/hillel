package hanna_aleksieitseva.hw16_collections.task3_set;

public class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
