package homework_28_11_24;

public class Main {

    public static void main(String[] args) {
        // Create a Gas Boiler
        Boiler gasBoiler = new Boiler("Bosch", "Condensing", 200, 0.9, 1.5, 0.02);

        // Create a Heating System for a private house
        HeatingSystem heatingSystem = new HeatingSystem(gasBoiler, true, 120);

        // Install the system
        heatingSystem.installSystem();

        // Calculate monthly costs for different months
        for (int month = 1; month <= 12; month++) {
            double gasMonthlyCost = heatingSystem.calculateMonthlyGasCosts(month);
            double electricityMonthlyCost = heatingSystem.calculateElectricityCosts(month);
            System.out.printf("Month %d: Gas cost = %.2f m3 %n", month, gasMonthlyCost);
            System.out.printf("Month %d: Electricity cost = %.2f KW %n", month, electricityMonthlyCost);
        }
    }
}
