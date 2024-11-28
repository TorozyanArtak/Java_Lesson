package homework_25_11_24;

public class FuelMotorCar extends Car {
    private boolean isGasEnabled;

    public FuelMotorCar(String model, int produceYear, int enginePower) {
        super(model, produceYear, enginePower);
        this.isGasEnabled = false;
    }

    @Override
    public void getTypeOfCar() {
        System.out.println(model + " is a petrol or gas fuel car");
    }

    @Override
    public void startDriving() {
        if (isGasEnabled) {
            System.out.println(model + " is starting to drive using gas.");
        } else {
            System.out.println(model + " is starting to drive using fuel.");
        }
    }

    public void switchToGas() {
        isGasEnabled = true;
        System.out.println(model + " has switched to gas.");
    }

    public void switchToFuel() {
        isGasEnabled = false;
        System.out.println(model + " has switched to fuel.");
    }

}