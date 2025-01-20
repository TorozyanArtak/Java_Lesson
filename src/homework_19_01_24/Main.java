package homework_19_01_24;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<StudentGrades> studentGrades = new ArrayList<>();
        studentGrades.add(new StudentGrades("Aram", 18, 19, 20));
        studentGrades.add(new StudentGrades("Armen", 20, 17, 15));
        studentGrades.add(new StudentGrades("Emin", 16, 16, 16));
        studentGrades.add(new StudentGrades("Hayk", 20, 20, 20));
        studentGrades.add(new StudentGrades("Adam", 17, 17, 18));
        Collections.sort(studentGrades);
        System.out.println(studentGrades);
        StudentGrades st = new StudentGrades("Ashot", 20, 19, 18);
        boolean b = GenericMethod.isIN(st, studentGrades);
        System.out.println(b);


    }


}
