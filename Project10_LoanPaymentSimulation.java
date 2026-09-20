import java.util.Scanner;

public class Project10_LoanPaymentSimulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get loan details from the user
        System.out.println("=== Loan Payment Simulation ===");
        System.out.print("Enter loan amount: $");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter monthly payment: $");
        double monthlyPayment = scanner.nextDouble();

        // convert annual rate to a monthly rate
        double monthlyRate = annualInterestRate / 100 / 12;
        double balance = loanAmount;
        double totalInterest = 0;
        double totalPaid = 0;
        int numPayments = 0;
        boolean canBePaidOff = true;

        System.out.println();
        System.out.println("Month\tStarting Balance\tInterest\tPayment\tEnding Balance");

        // simulate the loan one month at a time until it's paid off
        while (balance > 0) {
            double interest = balance * monthlyRate;

            // stop if the payment doesn't even cover the interest
            if (monthlyPayment <= interest) {
                System.out.println();
                System.out.println("Loan cannot be paid off with this payment.");
                canBePaidOff = false;
                break;
            }

            numPayments = numPayments + 1;

            // don't overpay on the last month
            double paymentThisMonth = monthlyPayment;
            if (monthlyPayment > balance + interest) {
                paymentThisMonth = balance + interest;
            }

            double startingBalance = balance;
            double endingBalance = balance + interest - paymentThisMonth;

            System.out.println(numPayments + "\t" + round2(startingBalance) + "\t"
                    + round2(interest) + "\t" + round2(paymentThisMonth) + "\t"
                    + round2(endingBalance));

            totalInterest = totalInterest + interest;
            totalPaid = totalPaid + paymentThisMonth;
            balance = endingBalance;

            // clean up tiny leftover balance from rounding
            if (balance < 0.005) {
                balance = 0;
            }
        }

        // print final summary
        if (canBePaidOff) {
            System.out.println();
            System.out.println("===== LOAN SUMMARY =====");
            System.out.println();
            System.out.println("Original Loan: $" + round2(loanAmount));
            System.out.println("Total Interest: $" + round2(totalInterest));
            System.out.println("Total Paid: $" + round2(totalPaid));
            System.out.println("Number of Payments: " + numPayments);
        }

        scanner.close();
    }

    // rounds a number to 2 decimal places
    public static double round2(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}