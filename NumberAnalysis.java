import java.util.Scanner;

public class NumberAnalysis {

    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {

        // Get the starting and ending number
        int start;
        int end;

        System.out.print("Start: ");
        start = console.nextInt();

        System.out.print("End: ");
        end = console.nextInt();

        // Counters
        int prime = 0;
        int composite = 0;
        int even = 0;
        int odd = 0;
        int palindrome = 0;
        int armstrong = 0;
        int perfect = 0;
        int abundant = 0;
        int deficient = 0;

        // Variables for largest numbers
        int largestPrime = 0;
        int largestPerfect = 0;
        int largestArmstrong = 0;

        // Check every number from start to end
        for (int num = start; num <= end; num++) {

            // PRIME AND COMPOSITE

            int count = 0;

            // Count how many numbers can divide num
            for (int i = 1; i <= num; i++) {

                if (num % i == 0) {
                    count++;
                }
            }

            // A prime number only has 2 factors
            if (count == 2) {
                prime++;
                // Find the largest prime
                if (num > largestPrime) {
                    largestPrime = num;
                }
            }

            // A composite number has more than 2 factors
            else if (count > 2) {
                composite++;
            }

            // EVEN AND ODD
            if (num % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }

            // PALINDROME
            int original = num;
            int temp = num;
            int reverse = 0;

            // Reverse the number
            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }

            // Compare original number and reversed number
            if (original == reverse) {
                palindrome++;
            }

            // ARMSTRONG
            temp = num;
            int digits = 0;

            // Count the digits
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            temp = num;
            int sum = 0;

            // Get each digit
            while (temp > 0) {
                int digit = temp % 10;
                // Find the power of the digit
                int power = 1;
                for (int i = 1; i <= digits; i++) {
                    power = power * digit;
                }
                sum = sum + power;
                temp = temp / 10;
            }

            // Check if it is Armstrong
            if (sum == num) {
                armstrong++;
                // Find the largest Armstrong number
                if (num > largestArmstrong) {
                    largestArmstrong = num;
                }
            }

            // PERFECT, ABUNDANT, AND DEFICIENT
            int divisorSum = 0;
            // Add all proper divisors
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    divisorSum = divisorSum + i;
                }
            }

            // Perfect number
            if (divisorSum == num && num > 1) {
                perfect++;
                // Find the largest perfect number
                if (num > largestPerfect) {
                    largestPerfect = num;
                }
            }

            // Abundant number
            if (divisorSum > num) {
                abundant++;
            }

            // Deficient number
            if (divisorSum < num) {
                deficient++;
            }
        }

        // DISPLAY THE REPORT
        System.out.println();
        System.out.println("===== NUMBER ANALYSIS REPORT =====");
        System.out.println();
        System.out.println("Range: " + start + " - " + end);
        System.out.println();
        System.out.println("Prime Numbers: " + prime);
        System.out.println("Composite Numbers: " + composite);
        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);
        System.out.println();
        System.out.println("Palindrome Numbers: " + palindrome);
        System.out.println("Armstrong Numbers: " + armstrong);
        System.out.println("Perfect Numbers: " + perfect);
        System.out.println("Abundant Numbers: " + abundant);
        System.out.println("Deficient Numbers: " + deficient);
        System.out.println();
        System.out.println("Largest Prime: " + largestPrime);
        System.out.println("Largest Perfect Number: " + largestPerfect);
        System.out.println("Largest Armstrong Number: " + largestArmstrong);
    }
}