package hanna_aleksieitseva.hw8;

import java.util.Arrays;
import java.util.Scanner;

public class HW8_task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array, please.");
        int length = input.nextInt();
        int array[] = new int[length];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Unsorted array");
        printArrayVariantA(array);
        printArrayVariantB(array);
        printArrayVariantC(array);

        sort(array);
        System.out.println("Sorted array");
        printArrayVariantA(array);
        printArrayVariantB(array);
        printArrayVariantC(array);

    }

    private static void printArrayVariantA(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    private static void printArrayVariantC(int[] array) {
        System.out.println(Arrays.toString(array));
        ;
    }

    private static void printArrayVariantB(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}