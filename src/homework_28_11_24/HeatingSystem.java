package homework_28_11_24;

public class HeatingSystem {
    private Boiler boiler;
    private boolean isPrivateHouse; // Apartment - false, Private House - true
    private double area;
    private boolean installationDone;

    public HeatingSystem(Boiler boiler, boolean isPrivateHouse, double area) {
        this.boiler = boiler;
        this.isPrivateHouse = isPrivateHouse;
        this.area = area;
        this.installationDone = false;
    }

    public void installSystem() {
        if (!installationDone) {
            System.out.println("Installing heating system...");
            installationDone = true;
        } else {
            System.out.println("Heating system already installed.");
        }
    }

    public double calculateMonthlyGasCosts(int month) {
        double averageTemperature = getMonthTemperature(month);
        double temperatureDifference = 23 - averageTemperature;
        if (temperatureDifference > 0) {
            double boilerGasConsumption = boiler.calculateGasConsumption(temperatureDifference, area);
            return isPrivateHouse ? boilerGasConsumption * 1.5 : boilerGasConsumption;
        } else {
            return 0;
        }
    }

    public double calculateElectricityCosts(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Wrong month entered");
            return 0;
        }
        double averageTemperature = getMonthTemperature(month);
        double temperatureDifference = 23 - averageTemperature; // Assuming 23°C is the desired temperature
        if (temperatureDifference > 0) {
            return boiler.getElectricityConsumption() * 30 * 24;
        } else {
            return 0;
        }
    }

    private int getMonthTemperature(int month) {
        int temperature = 0;
        switch (month) {
            case 1:
                temperature = -2;
                break;
            case 2:
                temperature = -6;
                break;
            case 3:
                temperature = 2;
                break;
            case 4:
                temperature = 10;
                break;
            case 5:
                temperature = 20;
                break;
            case 6:
                temperature = 25;
                break;
            case 7:
                temperature = 30;
                break;
            case 8:
                temperature = 37;
                break;
            case 9:
                temperature = 22;
                break;
            case 10:
                temperature = 12;
                break;
            case 11:
                temperature = 5;
                break;
            case 12:
                temperature = 0;
        }
        return temperature;
    }
}

