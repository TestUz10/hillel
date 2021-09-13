package hanna_aleksieitseva.hw16_collections.task2_map;

import java.util.HashMap;
import java.util.Map;

public class Cats {
    /*Есть класс Cat с полем имя (name, String). Создать коллекцию  Map<String, Cat> (реализация HashMap).
    Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота. Вывести результат на экран, каждый элемент с новой строки.*/
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"Tiger", "Smokey", "Sam", "Kitty", "Shadow", "Simba", "Patch", "Lucky", "Sweety", "Fluffy"};
        Map<String, Cat> map = addCatsToTheMap(cats);
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
    public static Map<String, Cat> addCatsToTheMap(String[] cats) {
        Map<String, Cat> addCats = new HashMap<>();
        for (String s : cats) {
            addCats.put(s, new Cat(s));
        }
        return addCats;
    }
    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
    }
}


