package hanna_aleksieitseva.hw11.classObjectLesson;

import java.util.Objects;

// 1. Создать класс Person
public class Person {
    private String name;
    private int age;
    private boolean married;

    // 2. Создать конструктор, используя слово this
    public Person() {
        this.name = "Ivan";
        this.age = 30;
        this.married = false;
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }
// 3. Переделать toString() для класса Person класса используя форматирование(StringFormat)

    @Override
    public String toString() {
        return String.format("My name is %s. I'm %d years old. Am I married? %b", name, age, married);
    }
// 4. Переопределить метод hashcode() и equals()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if (age != person.age) return false;
        if (married != person.married) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (married ? 1 : 0);
        return result;
    }

// 5. Создать несколько объектов класса Person

    public static void main(String[] args) {
        Person man1 = new Person("John", 15, false);
        Person man2 = new Person("Tom", 55, true);
        Person woman1 = new Person("Jerry", 53, true);
        Person woman2 = new Person("Lily", 5, false);
// 6. Изменить значение поля “возраст” для созданного ранее объекта.
        System.out.println("Age was " + woman1.getAge());
        woman1.setAge(54);
        System.out.println("New age is " + woman1.getAge());
//7. Вывести значение: - поля возраст для всех объектов ; - поля имя для всех объектов ; - поля женат/замужем для всех объектов
        System.out.println(man1.getAge());
        System.out.println(man2.getAge());
        System.out.println(woman1.getAge());
        System.out.println(woman2.getAge());
        System.out.println(man1.getName());
        System.out.println(man2.getName());
        System.out.println(woman1.getName());
        System.out.println(woman2.getName());
        System.out.println(man1.married);
        System.out.println(man2.married);
        System.out.println(woman1.married);
        System.out.println(woman2.married);
        System.out.println();
        //  8. Создать массив, записать в него все ранее созданные объекты. Вывести массив в консоль
        Person[] people = new Person[]{man1, man2, woman1, woman2};
        for (Person person : people) {
            System.out.println(person);
            System.out.println("The first letter of my name is: " + person.getNameFirstLetter());
            System.out.printf("I've had %s anniversaries%n", person.getAnniversary());
        }
    }


    /* 9. Создать методы. Методы должны находится внутри класса Person. Методы должны что-то возвращать:
        - сколько юбилеев у меня уже было?(Юбилей - праздник 1 раз в 10 лет)
        - с какой буквы начинается мое имя?
        */
    public int getAnniversary() {
        return age / 10;
    }

    public char getNameFirstLetter() {
        return name.charAt(0);
    }

    // 10. Создать геттеры и сеттеры для всех полей
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}


