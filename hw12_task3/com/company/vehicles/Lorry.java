package hanna_aleksieitseva.hw12_task3.com.company.vehicles;

import hanna_aleksieitseva.hw12_task3.com.company.details.Engine;
import hanna_aleksieitseva.hw12_task3.com.company.professions.Driver;

public class Lorry extends Car{
    private int carrying;

    public Lorry(String carModel, String carClass, int weight, Driver driver, Engine engine, int carrying) {
        super(carModel, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry: " +  super.toString();
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lorry lorry = (Lorry) o;

        return carrying == lorry.carrying;
    }

    @Override
    public int hashCode() {
        return carrying;
    }
}

