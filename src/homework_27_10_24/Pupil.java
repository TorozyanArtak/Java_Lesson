package homework_27_10_24;

public class Pupil {
    private String firstName;
    private String lastName;
    private int age;

    public Pupil(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 6) {
            System.out.println("Pupil age cannot be less than 6");
            System.exit(1);
        }
        this.age = age;
    }

    public void printInfo() {
        System.out.println(getFirstName() + " " + getLastName() + " " + getAge() + " years old");
    }

}
