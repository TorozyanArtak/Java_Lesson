package homework_25_11_24;

public abstract class Car {
    protected String model;
    protected int produceYear;
    protected int enginePower;

    public Car(String model, int produceYear, int enginePower) {
        this.model = model;
        this.produceYear = produceYear;
        this.enginePower = enginePower;
    }

    public void getDetails() {
        System.out.println("Model: " + model + ", Produce year: " + produceYear + " ,Engine power: " + enginePower + " hp");
    }

    public abstract void getTypeOfCar();

    public abstract void startDriving();

}
