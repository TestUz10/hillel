package hanna_aleksieitseva.hw14.task1;

import hanna_aleksieitseva.hw14.task1.interfaces.Floating;

public class Swan extends Bird implements Floating {
    @Override
    public void swim() {
        System.out.println("I can swim");
    }

    public void eatSomething() {
        System.out.println("Eats grass");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "I'm Swan. I have beak: " + hasBeak();
    }
}
