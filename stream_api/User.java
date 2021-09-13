package hanna_aleksieitseva.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Создать класс User. Класс User содержит 2 поля: String name; int age. Создать список из User.
// Найти первого в списке User, у которого имя начинается с буквы“a”.Вывести имя этого User
public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
        new User("Danil", 10),
        new User("Lex", 20),
        new User("Alexa", 30));
        Optional<User> user = users.stream().filter(x -> x.getName().startsWith("A")).findFirst();
        user.ifPresent(System.out::println);

    }
}
