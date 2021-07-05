package hanna_aleksieitseva.hw8;

public class HW8_task2 {
    public static void main(String[] args) {
        int array[] = {4,5, 5, 5, 6};
        int sum = getSum(array);
        System.out.println("Sum of all elements is " + sum);
        System.out.println("Average is " + sum/array.length);
        System.out.println("Amount btw min and max el" + amountElementsBetweenMinAndMax(array));

    }

    private static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    private static int amountElementsBetweenMinAndMax(int[] arr) {
        int min = 0;
        int max = 0;
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (min > element) {
                min = element;
                indexMin = i;

            }
            if (max < element) {
                max = element;
                indexMax = i;
            }
        }
        return Math.abs(indexMax - indexMin) - 1;
    }}