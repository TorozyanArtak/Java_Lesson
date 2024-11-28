package homework_28_11_24;

public class Boiler {

    private String brand;
    private String type;
    private double waterVolume; //
    private double efficiency; // percentage
    private double electricityConsumption; // kWh per hour

    private double gasConsumptionRate; // m3 per hour per square meter per degree

    public Boiler(String brand, String type, double waterCapacity, double efficiency, double electricityConsumption, double gasConsumptionRate) {
        this.brand = brand;
        this.type = type;
        this.waterVolume = waterCapacity;
        this.efficiency = efficiency;
        this.electricityConsumption = electricityConsumption;
        this.gasConsumptionRate = gasConsumptionRate;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public double getWaterVolume() {
        return waterVolume;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public double getElectricityConsumption() {
        return electricityConsumption;
    }

    public double calculateGasConsumption(double temperatureDifference, double area) {
        return gasConsumptionRate * temperatureDifference * area / getEfficiency();
    }
}