package hanna_aleksieitseva.hw12_task3.com.company.vehicles;

import hanna_aleksieitseva.hw12_task3.com.company.details.Engine;
import hanna_aleksieitseva.hw12_task3.com.company.professions.Driver;

import java.util.Objects;

public class Car {
    private String carModel;
    private String carClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String carModel, String carClass, int weight, Driver driver, Engine engine) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return carModel + ", carClass: '" + carClass + '\'' +
                ", weight: " + weight +
                ", driver: " + driver +
                ", engine is " + engine;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("Car info:");
        System.out.println("carModel = " + carModel);
        System.out.println("carClass = " + carClass);
        System.out.println("weight = " + weight);
        System.out.println("engine = " + engine);
        System.out.println("driver = " + driver);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (weight != car.weight) return false;
        if (!Objects.equals(carModel, car.carModel)) return false;
        if (!Objects.equals(carClass, car.carClass)) return false;
        if (!Objects.equals(driver, car.driver)) return false;
        return Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        int result = carModel != null ? carModel.hashCode() : 0;
        result = 31 * result + (carClass != null ? carClass.hashCode() : 0);
        result = 31 * result + weight;
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        return result;
    }
}
