import java.util.Scanner;

public class CurrencyConverter {


    private static final double USD_TO_INR = 85.04;
    private static final double EUR_TO_INR = 88.43;
    private static final double INR_TO_USD = 0.012;
    private static final double INR_TO_EUR = 0.011;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();


        System.out.println("Select currency to convert from:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. INR");
        System.out.print("Choose an option (1-3): ");
        int fromCurrency = scanner.nextInt();


        System.out.println("Select currency to convert to:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. INR");
        System.out.print("Choose an option (1-3): ");
        int toCurrency = scanner.nextInt();


        double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);


        System.out.printf("Converted Amount: %.2f\n", convertedAmount);

        scanner.close();
    }

    private static double convertCurrency(double amount, int fromCurrency, int toCurrency) {

        double amountInINR = amount;

        switch (fromCurrency) {
            case 1:
                amountInINR = amount * USD_TO_INR;
                break;
            case 2:
                amountInINR = amount * EUR_TO_INR;
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid currency selection.");
                return 0;
        }


        switch (toCurrency) {
            case 1:
                return amountInINR * INR_TO_USD;
            case 2:
                return amountInINR * INR_TO_EUR;
            case 3: 
                return amountInINR;
            default:
                System.out.println("Invalid currency selection.");
                return 0;
        }
    }
}