package hanna_aleksieitseva.hw17_files.task2;

import hanna_aleksieitseva.hw17_files.task2.ComparatorArea;
import hanna_aleksieitseva.hw17_files.task2.House;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//2. Comparator vs Comparable
//For class in attachment implement Comparator(area) and Comparable(price).Sort collection according to Comparator and Comparable. Print values in console

public class Main {
    public static void main(String[] args) {
        House house1 = new House(450, 10000, "NY", true);
        House house2 = new House(70, 7000, "LA", false);
        House house3 = new House(100, 2000, "NY", true);
        House house4 = new House(234, 5000, "LA", false);
        House house5 = new House(115, 100000, "NY", true);

        List<House> houseList = new ArrayList<>();
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);
        houseList.add(house4);
        houseList.add(house5);

        System.out.println("Sorted by Price: ");
        Collections.sort(houseList);
        for (House item : houseList) {
            System.out.println(item);
        }
        System.out.println("Sorted by Area: ");
        Collections.sort(houseList, new ComparatorArea());
        for (House item : houseList) {
            System.out.println(item);
        }
    }
}