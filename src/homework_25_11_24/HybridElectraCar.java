package homework_25_11_24;

public class HybridElectraCar extends Car {

    public HybridElectraCar(String model, int produceYear, int enginePower) {
        super(model, produceYear, enginePower);
    }

    @Override
    public void getTypeOfCar() {
        System.out.println(model + " is a hybrid car");
    }

    @Override
    public void startDriving() {
        System.out.println(model + " is starting to drive using both electricity and petrol.");
    }
}
