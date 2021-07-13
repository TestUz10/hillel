package hanna_aleksieitseva.hw9;


import java.io.*;

public class HW9_task2 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Enter 2 words.... ");
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        String c = (a.substring(0, a.length() / 2)) +
                (b.substring(b.length() / 2, b.length()));
        String d = (b.substring(0, b.length() / 2)) +
                (a.substring(a.length() / 2, a.length()));
        System.out.println(c);
        System.out.println(d);
    }
}
