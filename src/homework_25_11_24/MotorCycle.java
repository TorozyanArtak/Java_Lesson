package homework_25_11_24;

public class MotorCycle extends Car {

    public MotorCycle(String model, int produceYear, int enginePower) {
        super(model, produceYear, enginePower);
    }

    @Override
    public void getTypeOfCar() {
        System.out.println(model + " is a motorcycle");
    }

    @Override
    public void startDriving() {
        System.out.println(model + " is starting to drive using petrol.");
    }
}
