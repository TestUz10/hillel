package hanna_aleksieitseva.hw9;

import java.io.*;

public class HW9_task4 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        System.out.println("Enter 10 times smth");

        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        int averageLength = getAverageLength(array);
        printStringsWithAvLengthLessThan(array, averageLength);

    }

    private static void printStringsWithAvLengthLessThan(String[] array, int averageLength) {
        for (String element : array) {
            if (element.length() < averageLength) {
                System.out.println(element);
            }
        }
    }

    private static int getAverageLength(String[] strings) {
        int sum = 0;
        for (String element : strings) {
            sum += element.length();
        }
        return sum / strings.length;
    }
}
