package homework_24_11_24;

public class Lion extends Animal{

    public Lion(String name, int age) {
        super(name,age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " make roar");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eat a meat");
    }
}

