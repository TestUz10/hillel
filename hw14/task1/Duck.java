package hanna_aleksieitseva.hw14.task1;

import hanna_aleksieitseva.hw14.task1.interfaces.Beak;
import hanna_aleksieitseva.hw14.task1.interfaces.Eat;
import hanna_aleksieitseva.hw14.task1.interfaces.Floating;

public class Duck extends Toy implements Beak, Floating, Eat {
    Duck(String material, String color) {
        this.color = color;
        this.material = material;
    }

    @Override
    public boolean hasBeak() {
        return true;
    }

    @Override
    public void swim() {
        System.out.println("I can swim");

    }

    @Override
    public void eatSomething() {
        System.out.println("I can not eat as I'm toy");
    }

    @Override
    public String toString() {
        return "I'm" +color+" "+ material + " duck. And it has a beak " + hasBeak();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
