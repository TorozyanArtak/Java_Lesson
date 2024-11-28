package homework_14_11_24;

public class Monkey extends Animal implements PerformTrick{

    public Monkey(String name, int age) {
        super(name,age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " make scream");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eat a banana");
    }

    @Override
    public void performTrick() {
        System.out.println(getName()+ " lie ");
    }
}
