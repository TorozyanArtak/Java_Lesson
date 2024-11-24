package homework_24_11_24;

public abstract class Animal {
    private String name;
    private int age;

    public Animal ( String name , int age){
        setName(name);
        setAge(age);
    }

    public abstract void makeSound();

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
