package homework_19_02_25;

public class Student { private final String name;
    private final int age;
    private double grade;
    private final String birthYear;

    public Student(String name, int age, double grade, String birthYear) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade + ", Birth year: " + birthYear;
    }
}
