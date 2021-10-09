package hanna_aleksieitseva.hw13;

import hanna_aleksieitseva.newYearPresent.*;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        Sweets sweets = new Sweets();
        Fruit fruit = new Fruit("apple", 23, false);
        Chocolate chocolate = new Chocolate();

        Gummy gummy = new Gummy();
        gummy.setWeight(10);

        Other other = new Other();
        Cookies cookies = new Cookies("maria", 12, false);
        Sweets raffaello = new Chocolate("rafaello", 20, false);

        Sweets[] fixedSweets = {sweets, chocolate, cookies, fruit, other, gummy, raffaello};

        System.out.println("Sweets with fixed length:" + Arrays.toString(fixedSweets));

        int random = (int) ((Math.random() * (7 - 1)) + 1);
        Sweets[] dynamicSweets = new Sweets[random];
        System.arraycopy(fixedSweets, 0, dynamicSweets, 0, random);
        System.out.println("Dynamic sweets: " + Arrays.toString(dynamicSweets));

    }
}
