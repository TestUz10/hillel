package hanna_aleksieitseva.hw9_strings;
/*) а) Дано два числа, например 3 и 56, необходимо составить следующие строки:
             3 + 56 = 59; 3 – 56 = -53; 3 * 56 = 168. Используем метод StringBuilder.append().
    б) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().*/
public class HW9_task7 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = createSomeString(3, 56);
        System.out.println(stringBuilder1);
        replaceSomeString(stringBuilder1);
        System.out.println(stringBuilder1);
    }

    private static StringBuilder createSomeString(int a, int b) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        stringBuilder.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        stringBuilder.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return stringBuilder;
    }

    private static StringBuilder replaceSomeString(StringBuilder stringBuilder) {
        int change;
        while ((change = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.replace(change, change + 1, " равно");
        }
        return stringBuilder;
    }
}
