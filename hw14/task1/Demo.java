package hanna_aleksieitseva.hw14.task1;

public class Demo {
    public static void main(String[] args) {
        Platypus platypus = new Platypus(3);
        System.out.println(platypus);
        platypus.swim();
        platypus.eatSomething();
        System.out.println();

        Duck duck = new Duck("rubber", "yellow");
        System.out.println(duck);
        duck.swim();
        duck.eatSomething();
        System.out.println();

        Martin martin = new Martin();
        System.out.println(martin);
        martin.fly();
        martin.eatSomething();
        System.out.println();

        Swan swan = new Swan();
        System.out.println(swan);
        swan.swim();
        swan.fly();
        swan.eatSomething();
    }

}
