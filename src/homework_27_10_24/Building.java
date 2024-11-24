package homework_27_10_24;

public class Building {
    private int drainageSystemCount;
    private int electricityVoltage;

    public Building(int drainageSystemCount, int electricityVoltage) {
        setDrainageSystemCount(drainageSystemCount);
        setElectricityVoltage(electricityVoltage);
    }

    public void setDrainageSystemCount(int count) {
        if (count < 0) {
            System.out.println("Building drainage system count cannot be less tan 1");
            System.exit(1);
        }
        this.drainageSystemCount = count;
    }

    public void setElectricityVoltage(int voltage) {
        if (voltage < 0) {
            System.out.println("Building electricity voltage cannot be less tan 1");
            System.exit(1);
        }
        this.electricityVoltage = voltage;
    }

    public int getDrainageSystemCount() {
        return drainageSystemCount;
    }

    public int getElectricityVoltage() {
        return electricityVoltage;
    }

}
