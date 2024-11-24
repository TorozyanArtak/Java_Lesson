package homework_24_10_24;

public class Teacher {
    private double w;
    private double salary;

    private static double K;
    private static double MIN_SALARY;
    private static double minBaseSalary;

    static {

        minBaseSalary = K * MIN_SALARY;
    }


    public Teacher(double w) {
        setW(w);
        this.salary = w * minBaseSalary;  // Calculate salary based on W and minBaseSalary
    }

    public static void setBaseValues(double k, double minSalary) {
        if (k < 1) {
            System.out.println("k must be at least 1.");
            System.exit(2);
        } else {
            K = k;
            MIN_SALARY = minSalary;
            minBaseSalary = K * MIN_SALARY;
        }
    }

    public static double getMinBaseSalary() {
        return minBaseSalary;
    }

    public void setW(double w) {
        if (w < 1) {
            System.out.println("w must be at least 1.");
            System.exit(2);
        }
        this.w = w;
    }

    public double getSalary() {
        return salary;
    }
}
