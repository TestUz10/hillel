package hanna_aleksieitseva.hw8;

import java.util.Arrays;
import java.util.Random;

public class HW8_task1 {
    public static void main(String[] args) {
        int[] givenArray = generateArray();
        int sumFirstHalf = sum(givenArray, 0, 2);
        int sumSecondHalf = sum(givenArray, 3, 5);
        // System.out.println("sumFirstHalf = " + sumFirstHalf);
        // System.out.println("sumSecondHalf = " + sumSecondHalf);
        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Билет счастливый: true");
        } else {
            System.out.println("Билет счастливый: false");
        }
    }

    private static int[] generateArray() {
        int[] givenArray = new int[6];
        for (int i = 0; i < givenArray.length; i++) {
            Random random = new Random();
            givenArray[i] = random.nextInt(9);
        }
        System.out.println(Arrays.toString(givenArray));
        return givenArray;
    }

    private static int sum(int[] arr, int indexFrom, int indexTo) {
        int sum = 0;
        for (int i = indexFrom; i <= indexTo; i++) {
            sum += arr[i];
        }
        return sum;
    }
}