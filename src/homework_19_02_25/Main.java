package homework_19_02_25;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            students.add(generateRandomStudent());
        }

        students.forEach(System.out::println);
        System.out.println("------------------------");
        printStudentsTheseAgeBetween(students, 18, 22);
        System.out.println("------------------------");
        printStudentsTheseGradeBetween(students, 60, 80);
        System.out.println("------------------------");
        printStudentsCountByBirthYear(students);
        System.out.println("------------------------");
        printAverageGradeByAgeGraterThan(students, 20);
        System.out.println("------------------------");
        if (isAllStudentsGradeGraderThan(students, 45)) {
            System.out.println("All students grade is more than 45");
        } else {
            System.out.println("There is at least one student which grade isn't more than 45");
        }
        System.out.println("------------------------");
        printStudentWithLowestGrade(students);
        System.out.println("------------------------");
        System.out.printf("Students names by alphabetical:%n%s%n", getStudentsNamesByAlphabeticOrder(students));
        System.out.println("------------------------");
        groupStudentsByGradeRange(students);
        System.out.println("------------------------");
        printYoungestStudent(students);
    }

    public static Student generateRandomStudent() {
        Random random = new Random();

        String[] names = {"Anna", "Davit", "Emma", "Karen", "Gevorg", "Zara", "Arman", "Ashot", "Lilit", "Lusine",
                "Petros", "Artur", "Sevak", "Shahane", "Karine", "Nare", "Aram", "Tigran", "Ani", "Hayarpi", "Grigor", "Shushan",
                "Marine", "Suren", "Zaqar"};
        String name = names[random.nextInt(names.length)];

        int age = random.nextInt(10) + 16;
        double grade = random.nextDouble()*99 + 1;
        int birthYear = 2025 - age;

        return new Student(name, age, grade, String.valueOf(birthYear));
    }

    public static void printStudentsTheseAgeBetween(List<Student> students, int minAge, int maxAge) {
        students.stream()
                .filter(student -> student.getAge() >= minAge && student.getAge() <= maxAge)
                .map(Student::getName)
                .forEach(System.out::println);
    }

    public static void printStudentsTheseGradeBetween(List<Student> students, double minGrade, double maxGrade) {
        students.stream()
                .filter(student -> student.getGrade() >= minGrade && student.getGrade() <= maxGrade)
                .map(Student::getName)
                .forEach(System.out::println);
    }

    public static void printStudentsCountByBirthYear(List<Student> students) {
        students.stream()
                .collect(Collectors.groupingBy(Student::getBirthYear, Collectors.counting()))
                .forEach((birthYear, studentsCount) ->
                        System.out.printf("Birth Year: %s - students count: %d%n", birthYear, studentsCount));
    }

    public static void printAverageGradeByAgeGraterThan(List<Student> students, int minAge) {
        OptionalDouble averageGrade = students.stream()
                .filter(student -> student.getAge() >= minAge)
                .mapToDouble(Student::getGrade)
                .average();
        averageGrade.ifPresentOrElse(
                average -> System.out.printf("Average grade of students by %d years old or oldest is %s%n", minAge, average),
                () -> System.out.printf("There isn't student with %d years old or oldest%n", minAge)
        );
    }

    public static boolean isAllStudentsGradeGraderThan(List<Student> students, double grade) {
        return students.stream()
                .allMatch(student -> student.getGrade() > grade);
    }

    public static void printStudentWithLowestGrade(List<Student> students) {
        Optional<Student> studentWithLowGrade = students.stream()
                .min(Comparator.comparingDouble(Student::getGrade));
        studentWithLowGrade.ifPresent(student -> System.out.printf("Student with lowest grate is %s%n", student));
    }

    public static String getStudentsNamesByAlphabeticOrder(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .sorted()
                .collect(Collectors.joining(","));
    }

    public static void groupStudentsByGradeRange(List<Student> students) {
        students.stream()
                .collect(Collectors.groupingBy(student -> {
                    if (student.getGrade() < 60) return "Below 60";
                    else if (student.getGrade() <= 70) return "60 - 70";
                    else return "Above 70";
                })).forEach((gradeRange, groupedStudents) -> {
                    System.out.printf("Grade %s%n", gradeRange);
                    groupedStudents.forEach(System.out::println);
                });
    }

    public static void printYoungestStudent(List<Student> students) {
        students.stream()
                .min(Comparator.comparingInt(Student::getAge))
                .ifPresent(student -> System.out.printf("The youngest student is: %s%n", student));
    }
}