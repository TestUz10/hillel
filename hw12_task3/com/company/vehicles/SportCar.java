package hanna_aleksieitseva.hw12_task3.com.company.vehicles;

import hanna_aleksieitseva.hw12_task3.com.company.details.Engine;
import hanna_aleksieitseva.hw12_task3.com.company.professions.Driver;

public class SportCar extends Car {
    private int speed;

    public SportCar(String carModel, String carClass, int weight, Driver driver, Engine engine, int speed) {
        super(carModel, carClass, weight, driver, engine);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar: " + super.toString() +
                "speed: " + speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SportCar sportCar = (SportCar) o;

        return speed == sportCar.speed;
    }

    @Override
    public int hashCode() {
        return speed;
    }
}
