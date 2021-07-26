package hanna_aleksieitseva.hw14.task1;

public class Martin extends Bird {
    @Override
    public void eatSomething() {
        System.out.println("Eats bugs");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "I'm Martin. I have beak: " + hasBeak();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
