package homework_24_11_24;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Lion("Gazan", 7), new Monkey("nikol", 51), new Elephant("Hska",12)};

        for( Animal animal: animals){
            if (animal instanceof Monkey || animal instanceof Elephant){
                ((PerformTrick) animal).performTrick();
            }
            animal.eat();
            animal.makeSound();

        }

    }
}
