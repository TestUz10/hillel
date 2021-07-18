package hanna_aleksieitseva.hw12_task3.com.company;

import hanna_aleksieitseva.hw12_task3.com.company.details.Engine;
import hanna_aleksieitseva.hw12_task3.com.company.professions.Driver;
import hanna_aleksieitseva.hw12_task3.com.company.vehicles.Lorry;
import hanna_aleksieitseva.hw12_task3.com.company.vehicles.SportCar;

public class Demo {
    public static void main(String[] args) {
        Driver driver = new Driver(45, "Oleg Orlov", 15);
        Lorry lorry = new Lorry("Belaz", "A", 12000, driver,
                new Engine("LAZ", 555), 1005);
        SportCar sportCar = new SportCar("Chevy Camaro", "A", 1200, driver, new Engine("Chevrolet", 376), 500);
        System.out.println(lorry);
        System.out.println(sportCar);
    }

}