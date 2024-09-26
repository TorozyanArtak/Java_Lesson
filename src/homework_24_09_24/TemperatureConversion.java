package homework_24_09_24;

public class TemperatureConversion {
    public static void main(String[] args) {
        double celsius = -273.15;
        double fahrenheit = -459.67;
        System.out.println(convertTemperature(celsius,true));
        System.out.println(convertTemperature(fahrenheit));
    }

    // I have got max and min values from this article https://meteoinfo.ru/t-scale#
    // Temperature in Celsius converted in Fahrenheit
    public static double convertTemperature(double celsius, boolean c) {
        if( celsius < -273.15 ){
            System.out.println( "Celsius should not be less than -273.15");
            return 0;
        }
      return (celsius * 1.8) + 32;
    }

    // Temperature in Fahrenheit converted in Celsius
    public static double convertTemperature(double fahrenheit) {
        if (fahrenheit < -459.67 ) {
            System.out.println("Fahrenheit should not be less than −459.67");
            return 0;
        }
        return (fahrenheit - 32) / 1.8;
    }

}
