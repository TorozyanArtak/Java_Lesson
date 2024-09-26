package homework_24_09_24;

public class IncomeTaxBasedOnSalary {
    public static void main(String[] args) {
        double mySalary = 500000.0;
        double myCustomTaxRate = 15.0;
        System.out.println(calculateIncomeTax(mySalary));
        System.out.println(calculateIncomeTax(mySalary, myCustomTaxRate));
        System.out.println(calculateIncomeTax(mySalary, true));
        System.out.println(calculateIncomeTax(mySalary, false));
    }

    public static double calculateIncomeTax(double grossSalary) {
        return calculateIncomeTax(grossSalary, 20);
    }

    public static double calculateIncomeTax(double grossSalary, double customTaxRate) {
        if (grossSalary <= 0 || customTaxRate < 0 || customTaxRate > 100) {
            System.out.println("Custom tax rate should not be less than 0 or more than 100");
            return 0;
        }
        return grossSalary - grossSalary * customTaxRate / 100;
    }

    public static double calculateIncomeTax(double grossSalary, boolean isItEmployee) {
        if (isItEmployee) {
            return calculateIncomeTax(grossSalary, 10);
        } else {
            return calculateIncomeTax(grossSalary, 20);
        }
    }
}

