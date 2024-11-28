package homework_14_11_24;

public class Elephant extends Animal implements PerformTrick{

    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " make trumpeting sound");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eat a grass");
    }

    @Override
    public void performTrick() {
        System.out.println(getName() + " dance");
    }
}

