package homework_25_11_24;

public class DieselMotorCar extends Car {

    public DieselMotorCar(String model, int produceYear, int enginePower) {
        super(model, produceYear, enginePower);
    }

    @Override
    public void getTypeOfCar() {
        System.out.println(model + " is a diesel car");
    }

    @Override
    public void startDriving() {
        System.out.println(model + " is starting to drive using diesel fuel.");
    }
}

