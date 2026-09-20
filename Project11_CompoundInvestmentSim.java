import java.util.Scanner;

public class Project11_CompoundInvestmentSim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get investment details from the user
        System.out.println("=== Compound Investment Simulator ===");
        System.out.print("Enter initial investment: $");
        double initialInvestment = scanner.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter monthly contribution: $");
        double monthlyContribution = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int numYears = scanner.nextInt();

        // convert annual rate to a monthly rate, and years to months
        double monthlyRate = annualInterestRate / 100 / 12;
        int totalMonths = numYears * 12;
        double balance = initialInvestment;
        double totalContributions = 0;

        System.out.println();
        System.out.println("Month\tStarting Balance\tInterest\tContribution\tEnding Balance");

        // simulate the account one month at a time
        for (int month = 1; month <= totalMonths; month++) {
            double startingBalance = balance;
            double interest = startingBalance * monthlyRate;
            double endingBalance = startingBalance + interest + monthlyContribution;

            System.out.println(month + "\t" + round2(startingBalance) + "\t"
                    + round2(interest) + "\t" + round2(monthlyContribution) + "\t"
                    + round2(endingBalance));

            totalContributions = totalContributions + monthlyContribution;
            balance = endingBalance;
        }

        double interestEarned = balance - initialInvestment - totalContributions;

        // print final summary
        System.out.println();
        System.out.println("===== INVESTMENT SUMMARY =====");
        System.out.println();
        System.out.println("Initial Investment: $" + round2(initialInvestment));
        System.out.println("Total Contributions: $" + round2(totalContributions));
        System.out.println("Interest Earned: $" + round2(interestEarned));
        System.out.println("Final Balance: $" + round2(balance));

        scanner.close();
    }

    // rounds a number to 2 decimal places
    public static double round2(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}