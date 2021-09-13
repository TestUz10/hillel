package hanna_aleksieitseva.hw9_strings;
//Создать строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету]. Форматирование и вывод строки на
//консоль написать в отдельном методе, который принимает фамилию, оценку и название предмета в качестве параметров.
//Пример: Студент Иванов получил 5 по биологии
public class HW9_task1 {
    public static void main(String[] args) {
        String student = String.format("Student %s got %d by %s", "Ivanov", 5, "Biology");
        System.out.println(student);
    }
}
