package hanna_aleksieitseva.hw14.task1;

import hanna_aleksieitseva.hw14.task1.interfaces.Beak;
import hanna_aleksieitseva.hw14.task1.interfaces.Eat;
import hanna_aleksieitseva.hw14.task1.interfaces.Flying;

public abstract class Bird implements Flying, Eat, Beak {
    public boolean hasBeak() {
        return true;
    }

    public void fly() {
        System.out.println("I can fly");
    }

}
