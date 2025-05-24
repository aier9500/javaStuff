package InvestmentReturnCalculator;

import java.util.Scanner;

public class InvestmentReturnCalculator {

    final static double MONTHLY_RETURN_RATE_PERCENT = 1.1715;
    final static double YEARLY_RETURN_RATE_PERCENT = 15;
    static double monthlyInvestment;
    static double yearlyInvestment;

    public static void main(String[] args) {

        System.out.println("\n\n---- Program start ----\n\n\n");
        fetchInfo();
    }

    private static void fetchInfo() {

        String calculationTypeMenu = "1. How do you want to calculate your returns? (Enter a corresponding letter)\n" + //
                "       a) Monthly returns\n" + // CalculationType calculationType;
                "       b) Yearly returns\n" + //
                "       x) Terminate program\n\n";
        System.out.println(calculationTypeMenu);

        Scanner scanner = new Scanner(System.in);
        char calculationTypeChar = scanner.nextLine().charAt(0);

        if (calculationTypeChar == 'a') { // Monthly

            monthlyReturnCalculator();

        } else if (calculationTypeChar == 'b') { // Yearly

            System.out.println("I haven't made the yearly calculator just yet...");

        } else { // Calls fetchInfo again

            System.out.println("That is not a valid option, please try again.");
            fetchInfo();
        }

        scanner.close();
    }

    private static void monthlyReturnCalculator() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nWhat is the amount you wish to invest monthly?");
        double monthlyInvestmentAmount = scanner.nextDouble();
        System.out.println("\n\nFor how many Months do you want to invest?");
        int numberOfMonths = scanner.nextInt();

        double finalPrincipalInvestment = 0;
        double finalBalance = 0;
        double finalProfit = 0;
        double finalProfitPercentage = 0;

        finalPrincipalInvestment = Math.round(numberOfMonths * monthlyInvestmentAmount * 100.0) / 100.0;

        System.out.print("\n\n");
        finalBalance += monthlyInvestmentAmount * (100.0 + MONTHLY_RETURN_RATE_PERCENT) / 100.0; // Month 1
        System.out.println("This is month " + 1 + " and the balance is $" + Math.round(finalBalance * 100.0) / 100.0);
        for (int i = 2; i < numberOfMonths + 1; i++) {
            finalBalance += finalBalance * MONTHLY_RETURN_RATE_PERCENT / 100.0 + monthlyInvestmentAmount;
            System.out
                    .println("This is month " + i + " and the balance is $" + Math.round(finalBalance * 100.0) / 100.0);
        }
        finalBalance = Math.round((finalBalance * 100.0) / 100.0);

        finalProfit = Math.round((finalBalance - finalPrincipalInvestment) * 100.0) / 100.0;

        finalProfitPercentage = Math.round(finalProfit / finalPrincipalInvestment * 100.0 * 1000.0) / 1000.0;

        String monthlyReturnMenu = "\n\nYou have invested a total of $" + finalPrincipalInvestment + "\n" + //
                "Your final balance after " + numberOfMonths + " months assuming a monthly return of "
                + MONTHLY_RETURN_RATE_PERCENT + "% is $" + finalBalance + " with a profit of $"
                + finalProfit + " and " + finalProfitPercentage + "%.";
        System.out.println(monthlyReturnMenu);

        scanner.close();
    }
}
