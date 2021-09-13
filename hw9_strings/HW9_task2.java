package hanna_aleksieitseva.hw9_strings;

import java.io.*;

/*
Условие задачи: ввести 2 слова с клавиатуры, состоящие из четного числа букв. Получить слово состоящее из первой половины
1го слова и 2й половины 2го слова. Вывести полученное слово на экран String a = “1122”; String b = “3344”; ”Result: 1144”
 */
public class HW9_task2 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Enter 2 words.... ");
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        String c = a.substring(0, a.length() / 2) + b.substring(b.length() / 2);
        System.out.println(c);
    }
}
