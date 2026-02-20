import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double k) {
        return (k - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double temp;

        do {
            // Display menu
            System.out.println("\nTemperature Converter Menu:");
            System.out.println("1.Celsius to Fahrenheit");
            System.out.println("2.Celsius to Kelvin");
            System.out.println("3.Fahrenheit to Celsius");
            System.out.println("4.Fahrenheit to Kelvin");
            System.out.println("5.Kelvin to Celsius");
            System.out.println("6.Kelvin to Fahrenheit");
            System.out.println("7.Exit");

            System.out.print("Enter your choice(1-7): ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 6) {
                System.out.print("Enter temperature: ");
                temp = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.printf("%.2f °C = %.2f °F\n",
                                temp, celsiusToFahrenheit(temp));
                        break;
                    case 2:
                        System.out.printf("%.2f °C = %.2f K\n",
                                temp, celsiusToKelvin(temp));
                        break;
                    case 3:
                        System.out.printf("%.2f °F = %.2f °C\n",
                                temp, fahrenheitToCelsius(temp));
                        break;
                    case 4:
                        System.out.printf("%.2f °F = %.2f K\n",
                                temp, fahrenheitToKelvin(temp));
                        break;
                    case 5:
                        System.out.printf("%.2f K = %.2f °C\n",
                                temp, kelvinToCelsius(temp));
                        break;
                    case 6:
                        System.out.printf("%.2f K = %.2f °F\n",
                                temp, kelvinToFahrenheit(temp));
                        break;
                }
            } else if (choice != 7) {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 7);

        System.out.println("Program exited. Goodbye!");
        scanner.close();
    } 
}
