import java.util.Scanner;

public class EnhancedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnhanced Calculator");
            System.out.println("1. Arithmetic Operations");
            System.out.println("2. Scientific Calculations");
            System.out.println("3. Unit Conversions");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    arithmeticOperations(scanner);
                    break;
                case 2:
                    scientificCalculations(scanner);
                    break;
                case 3:
                    unitConversions(scanner);
                    break;
                case 4:
                    System.out.println("Exiting calculator. Goodbye! Take care!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void arithmeticOperations(Scanner scanner) {
        System.out.print("\nEnter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nArithmetic Operations:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Choose an operation: ");
        int opChoice = scanner.nextInt();

        double result = 0;
        switch (opChoice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }
        System.out.println("Result: " + result);
    }

    public static void scientificCalculations(Scanner scanner) {
        System.out.println("\nScientific Calculations:");
        System.out.println("1. Square Root");
        System.out.println("2. Exponentiation");
        System.out.print("Choose an option: ");
        int sciChoice = scanner.nextInt();

        double result = 0;
        switch (sciChoice) {
            case 1:
                System.out.print("Enter number: ");
                double num = scanner.nextDouble();
                result = Math.sqrt(num);
                System.out.println("Square root: " + result);
                break;
            case 2:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                double exp = scanner.nextDouble();
                result = Math.pow(base, exp);
                System.out.println("Exponentiation result: " + result);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    public static void unitConversions(Scanner scanner) {
        System.out.println("\nUnit Conversions:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. USD to INR");
        System.out.println("3. Kilometers to Meters");
        System.out.println("4. Minutes to Seconds");
        System.out.println("5. Meters to Kilometers");
        System.out.println("6. Fahrenheit to Celsius");
        System.out.println("7. INR to USD");
        System.out.println("8. Seconds to Minutes");
        System.out.print("Choose a conversion: ");
        int convChoice = scanner.nextInt();

        switch (convChoice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.print("Enter amount in USD: ");
                double usd = scanner.nextDouble();
                double inr = usd * 74.0; // Example conversion rate, adjust as needed
                System.out.println("Amount in INR: " + inr);
                break;
            case 3:
                System.out.print("Enter distance in Kilometers: ");
                double kilometers = scanner.nextDouble();
                double meters = kilometers * 1000;
                System.out.println("Distance in Meters: " + meters);
                break;
            case 4:
                System.out.print("Enter time in Minutes: ");
                double minutes = scanner.nextDouble();
                double seconds = minutes * 60;
                System.out.println("Time in Seconds: " + seconds);
                break;
            case 5:
                System.out.print("Enter distance in Meters: ");
                meters = scanner.nextDouble();
                kilometers = meters / 1000;
                System.out.println("Distance in Kilometers: " + kilometers);
                break;
            case 6:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32) * 5/9;
                System.out.println("Temperature in Celsius: " + celsius);
                break;
            case 7:
                System.out.print("Enter amount in INR: ");
                inr = scanner.nextDouble();
                usd = inr / 74.0; // Example conversion rate, adjust as needed
                System.out.println("Amount in USD: " + usd);
                break;
            case 8:
                System.out.print("Enter time in Seconds: ");
                seconds = scanner.nextDouble();
                minutes = seconds / 60;
                System.out.println("Time in Minutes: " + minutes);
                break;
            default:
                System.out.println("Invalid conversion option.");
                break;
        }
    }
}