package hanna_aleksieitseva.hw8;

import java.io.BufferedReader;
import java.util.Scanner;

public class HW8_task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array, please.");
        int length = input.nextInt();
        int array[] = new int[length];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("The minimum value is: " + findMin(array));
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int element : arr) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }
}