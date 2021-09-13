package hanna_aleksieitseva.hw9_strings;

//Cтрока: “It's the possibility of having a dream come true that makes life interesting.”Note: использовать методы класса String
public class HW9_task5 {
    public static void main(String[] args) {
        String sentence = "It's the possibility of having a dream come true that makes life interesting.";

        //а) перевести в верхний регистр все буквы в строке. Вывести результат в консоль
        System.out.println(sentence.toUpperCase());

        //б) перевести в нижний регистр все буквы в строке. Вывести результат в консоль
        System.out.println(sentence.toLowerCase());

        //в) каждое слово должно начинаться с большой буквы. Вывести результат в консоль.
        StringBuilder result = new StringBuilder();
        for (String word : sentence.split(" ")) {
            result.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1))
                    .append(" ");

        }
        System.out.println(result);

    }
}




