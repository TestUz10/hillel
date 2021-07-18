package hanna_aleksieitseva.hw12_task3.com.company.professions;

public class Driver extends Person {
    private int drivingExperience;

    public Driver(int age, String fullName, int drivingExperience) {
        super(age, fullName);
        this.drivingExperience = drivingExperience;
    }


    @Override
    public String toString() {
        return super.toString() + " drivingExperience is " + drivingExperience;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Driver driver = (Driver) o;

        return drivingExperience == driver.drivingExperience;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + drivingExperience;
        return result;
    }
}

