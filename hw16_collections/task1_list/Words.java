package hanna_aleksieitseva.hw16_collections.task1_list;
import java.util.ArrayList;
public class Words {
    /*
    Создай список слов, заполни его самостоятельно. Модифицировать список следующим образом удалять из списка строк все слова,
    содержащие букву "р" удваивать все слова содержащие букву "л".Если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
    С другими словами ничего не делать.Пример:   роза  лира    лоза Выходные данные: лира  лоза   лоза
    */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("роза");
        list.add("магия");
        list.add("милота");
        list.add("равнозначность");
        list.add("лабиринт");
        list.add("ромашка");
        list.add("иволга");
        System.out.println("The list of words before: " + list);
        list = changingWords(list);
        System.out.println("The list of words after: ");
        for (String changedWords : list) {
            System.out.println(changedWords);
        }
    }
    public static ArrayList<String> changingWords(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (String word : list) {
            if (word.contains("р") && word.contains("л")) {
                result.add(word);
            } else if (word.contains("р")) {
            } else if (word.contains("л")) {
                result.add(word);
                result.add(word);
            } else {
                result.add(word);
            }
        }
        return result;
    }
}
