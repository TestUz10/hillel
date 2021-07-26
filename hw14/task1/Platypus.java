package hanna_aleksieitseva.hw14.task1;

import hanna_aleksieitseva.hw14.task1.interfaces.Beak;
import hanna_aleksieitseva.hw14.task1.interfaces.Eat;
import hanna_aleksieitseva.hw14.task1.interfaces.Floating;

public class Platypus extends Animal implements Beak, Floating, Eat {
    public Platypus(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean hasBeak() {
        return true;
    }

    @Override
    public void eatSomething() {
        System.out.println("Eats bugs");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
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
        return "I'm Platypus. I have beak: " + hasBeak() + ". My weight is " + weight;
    }
}
