import java.util.Scanner;

class TemperatureConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        System.out.print("Enter unit (C / F / K): ");
        char unit = sc.next().charAt(0);

        if (unit == 'C' || unit == 'c') {
            double f = (temp * 9 / 5) + 32;
            double k = temp + 273.15;
            System.out.println("Fahrenheit: " + f);
            System.out.println("Kelvin: " + k);

        } else if (unit == 'F' || unit == 'f') {
            double c = (temp - 32) * 5 / 9;
            double k = c + 273.15;
            System.out.println("Celsius: " + c);
            System.out.println("Kelvin: " + k);

        } else if (unit == 'K' || unit == 'k') {
            double c = temp - 273.15;
            double f = (c * 9 / 5) + 32;
            System.out.println("Celsius: " + c);
            System.out.println("Fahrenheit: " + f);

        } else {
            System.out.println("Invalid unit entered!");
        }

        sc.close();
    }
}
