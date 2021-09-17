package hanna_aleksieitseva.hw15_exceptions_and_enum.task2;

import hanna_aleksieitseva.hw15_exceptions_and_enum.task2.Rainbow;

import java.util.Arrays;

public class Test {
        public Test() {
        }

        public static void main(String[] args) {
            Rainbow[] color = Rainbow.values();
            System.out.println(Arrays.asList(Rainbow.values()));
            System.out.println("Blue color is " + Rainbow.BLUE.ordinal());
        }
    }
