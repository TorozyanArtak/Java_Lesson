package homework_24_09_24;

public class IncomeTaxBasedOnSalary {

    public static double calculateIncomeTax(double grossSalary) {
        validateSalary(grossSalary);
        return grossSalary * 0.2;
    }

    public static double calculateIncomeTax(double grossSalary, double customTaxRate) {
        validateSalary(grossSalary);
        return grossSalary * customTaxRate / 100;
    }

    public static double calculateIncomeTax(double grossSalary, boolean flag) {
        validateSalary(grossSalary);
        if (flag) {
            return grossSalary * 0.1;
        }
        return calculateIncomeTax(grossSalary);
    }


    public static void validateSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary should not be less than 0");
            System.exit(2);
        }
    }

    public static void main(String[] args) {
        boolean it = true;
        boolean noIt = false;
        System.out.println(calculateIncomeTax(105500));
        System.out.println(calculateIncomeTax(200000, 50000));
        System.out.println(calculateIncomeTax(200000, it));
        System.out.println(calculateIncomeTax(200000, noIt));
    }
}
