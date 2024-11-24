package homework_24_10_24;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher.setBaseValues(1.6, 100000);

        Teacher teacher1 = new Teacher(1.2);
        Teacher teacher2 = new Teacher(1.5);
        Teacher teacher3 = new Teacher(2.0);

        System.out.println("Teacher 1 salary: " + teacher1.getSalary());
        System.out.println("Teacher 2 salary: " + teacher2.getSalary());
        System.out.println("Teacher 3 salary: " + teacher3.getSalary());

        System.out.println("Minimum Base Salary: " + Teacher.getMinBaseSalary());
    }
}
