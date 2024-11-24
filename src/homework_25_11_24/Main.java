package homework_25_11_24;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new DieselMotorCar("BMW", 2015, 286),
                new FuelMotorCar("Audi", 2020, 320),
                new HybridElectraCar("Mercedes", 2022, 300),
                new MotorCycle("Harley Davidson", 2023, 220)};

        for (Car car : cars) {
            if (car instanceof FuelMotorCar) {
                ((FuelMotorCar) car).switchToGas();
            }
            car.getDetails();
            car.getTypeOfCar();
            car.startDriving();
        }

    }
}
