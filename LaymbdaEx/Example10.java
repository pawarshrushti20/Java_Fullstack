
@FunctionalInterface
interface TemperatureConverter {
    double convert(double celsius);
}

public class Example10 {
    public static void main(String[] args) {

        TemperatureConverter converter =
                (celsius) -> (celsius * 9 / 5) + 32;

        double celsius = 37.0;
        System.out.println("Temperature in Fahrenheit = " + converter.convert(celsius));
    }
}


