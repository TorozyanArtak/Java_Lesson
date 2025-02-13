package homework_13_02_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class DemoStudent  {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(new Student("Aram", 21, 89.5, "2004"),
                new Student("Armen", 22, 62.3, "2003"),
                new Student("Adam", 18, 70.4, "2007")));

        processStudents(students, student -> System.out.println(student));

        processStudents(students, System.out::println);

        processStudents(students, student -> student.setGrade(student.getGrade() * 1.10));
        processStudents(students, student -> {
            if (student.getGrade() > 90) {
                System.out.println(student.getName());
            }
        });

        Function<String, Integer> parseYear = Integer::parseInt;

        processStudents(students, student -> System.out.println(calculateAge(student.getBirthYear(), parseYear)));



    }

    public static void processStudents(List<Student> students, Consumer<Student> action) {
        for (Student student : students) {
            action.accept(student);
        }
    }

    public static int calculateAge(String birthYear, Function<String, Integer> parser) {
        int currentYear = 2025;
        int birthYearInt = parser.apply(birthYear);
        return currentYear - birthYearInt;
    }
}