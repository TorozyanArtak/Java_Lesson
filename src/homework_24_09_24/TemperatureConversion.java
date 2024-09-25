package homework_24_09_24;
// I have got max and min values from this article https://meteoinfo.ru/t-scale#
public class TemperatureConversion {
    // Temperature in Celsius converted in Fahrenheit
    public static double convertTemperature(int celsius) {
        if( celsius < -273 || celsius > 5526){
            System.out.println( "Celsius should not be less than -273 or more than 5526");
            System.exit(2);
        }
      return (celsius * 1.8) + 32;
    }

    // Temperature in Fahrenheit converted in Celsius
    public static double convertTemperature(double fahrenheit) {
        if (fahrenheit < -459.67 || fahrenheit > 9980) {
            System.out.println("Fahrenheit should not be less than −459.67 or more than 9980");
            System.exit(2);
        }
        return (fahrenheit - 32) / 1.8;
    }
    public static void main(String[] args) {
        System.out.println(convertTemperature(5526));
        System.out.println(convertTemperature(9980.0));

    }
}
