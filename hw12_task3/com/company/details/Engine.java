package hanna_aleksieitseva.hw12_task3.com.company.details;

import java.util.Objects;

public class Engine {
    private String company;
    private int power;

    public Engine(String company, int power) {
        this.company = company;
        this.power = power;
    }

    @Override
    public String toString() {
        return " company: " + company + ", power: " + power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (power != engine.power) return false;
        return Objects.equals(company, engine.company);
    }

    @Override
    public int hashCode() {
        int result = company != null ? company.hashCode() : 0;
        result = 31 * result + power;
        return result;
    }
}
