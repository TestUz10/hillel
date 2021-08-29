package hanna_aleksieitseva.hw9_strings;
/*
Посчитать результат выражений. Между числами могут быть слова только "plus" and "minus"
String s1 = "1 plus 5";  String s2 = "6 minus 5";  String s3 = "8 plus 10";  String s4 = "16 minus 5";
Результат вывести на консоль в виде:  “1 plus 5 = 6”
 */
public class HW9_task3 {
    public static void main(String[] args) {
        String s1 = "1 plus 5";
        String s2 = "6 minus 5";
        String s3 = "8 plus 10";
        String s4 = "16 minus 5";

        calculate(s1);
        calculate(s2);
        calculate(s3);
        calculate(s4);
    }

    private static void calculate(String expression) {
        String[] elements = expression.split(" ");
        int firstOperand = Integer.parseInt(elements[0]);
        int secondOperand = Integer.parseInt(elements[2]);
        String operator = elements[1];
        switch (operator) {
            case "plus":
                print(firstOperand, secondOperand, operator, Math.addExact(firstOperand, secondOperand));
                break;
            case "minus":
                print(firstOperand, secondOperand, operator, Math.subtractExact(firstOperand, secondOperand));
                break;
        }
    }

    private static void print(int firstOperand, int secondOperand, String operator, int result) {
        System.out.println(firstOperand + " " + operator + " " + secondOperand + "=" + result);
       // System.out.printf("%d %s %d=%d%n", firstOperand, operator, secondOperand, result);
    }

}