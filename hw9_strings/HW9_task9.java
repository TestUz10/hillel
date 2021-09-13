package hanna_aleksieitseva.hw9_strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class HW9_task9 {
//  Дана строка “Versions: Java 5, 6, 7, 8, 12. Найти все подстроки "Java X" и распечатать их. Использовать регулярные выражения
    public static void main(String[] args) {
        String s = "Versions: Java 5, Java 6, Java 7, Java 8, Java 12.";
        String s1 = "Java\\s+\\d+";
        Pattern pattern = Pattern.compile(s1);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
