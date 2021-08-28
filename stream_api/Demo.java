package hanna_aleksieitseva.stream_api;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        //1.Создать список строк. Найти строки, которые начинаются с буквы “a”, перевести строки в верхний регистр и вывести полученные строки
        System.out.print("Task 1. Strings A > 4 to UPPERCASE: ");
        List<String> stringList = Arrays.asList("qwert", "asdfghj", "zxcvb", "rty");
        stringList.stream().filter((String s) -> {
            return (s.length() > 4 && s.charAt(0) == 'a');
        }).map(s -> s.toUpperCase()).forEach(text -> System.out.print(text + "\n"));

//2. Создать список чисел. Найти все четные числа в списке и вывести их количество (т.е. в ответе должно быть число)
        List<Integer> integerList = Arrays.asList(3, 4, 6, 8, 9, 18, 12);
        long count = integerList.parallelStream().filter(i -> i % 2 == 0).count();
        System.out.println("Task 2. Quantity: " + count);
    }
}
