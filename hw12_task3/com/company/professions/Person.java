package hanna_aleksieitseva.hw12_task3.com.company.professions;

import java.util.Objects;

public class Person {
    private int age;
    private String fullName;

    public Person(int age, String fullName) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return  fullName + ". Age " + age +", ";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        return result;
    }
}
