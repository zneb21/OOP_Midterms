import java.util.Scanner;

public class Project3_NumberClassificationLab {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Ask the user for a starting number
        System.out.print("Enter your starting number:");
        int startno = input.nextInt();

        // Ast the user again for the ending number
       System.out.print("Enter your ending number:");
        int endno = input.nextInt();

        // make an int for the counters
        int primeno = 0;
        int perfectno = 0;
        int armstrongno = 0;
        int palindromeno = 0;

        //Prime
        System.out.println("\nPRIME NUMBERS");
        for (int number = startno; number <= endno; number++) {
            boolean prime = number > 1;

            for (int div1 = 2; div1 < number; div1++){
                if (number % div1 == 0){
                    prime = false;
                    break;
                }
            }
        

             if (prime){
                primeno++;
                System.out.print(number + " ");
            }
        }

        System.out.println();
        System.out.println("Total Prime numbers: " + primeno);

        //Perfect
        System.out.println("\nPERFECT NUMBERS");
        for (int number = startno; number <= endno; number++) {
            int divsum = 0;

                for (int div2 = 1; div2 < number; div2++){
                    if (number % div2 ==  0){
                        divsum = divsum + div2;
                    }
                }

                if (divsum == number){
                    perfectno++;
                    System.out.print(number + " ");
                }
        }

        System.out.println();
        System.out.println("Total Perfect numbers: " + perfectno);

        //Armstrong
        System.out.println("\nARMSTRONG NUMBERS");
        for (int number = startno; number <= endno; number++) {
            int count = 0;
                int temp = number;
                 while (temp > 0) {
                 count++;
                 temp = temp / 10;
                }

            int countsum = 0;
                    temp = number;

            while (temp > 0) {
                int digit = temp % 10;
                 int power = 1;

                for (int i = 1; i <= count; i++) {
                 power = power * digit;
            }

                    countsum = countsum + power;
                temp = temp / 10;
            }

            if (countsum == number) {
                armstrongno++;
                System.out.print(number + " ");
            }
        }

        System.out.println();
        System.out.println("Total Armstrong numbers: " + armstrongno);

        //Palindrome
        System.out.println("\nPALINDROME NUMBERS");
        for (int number = startno; number <= endno; number++) {
            int rev = 0;
            int temp2 = number;

            while (temp2 > 0){
                int digit2 = temp2 % 10;
                rev = rev * 10 + digit2;
                temp2 = temp2 / 10;
            }

            if (rev == number){
                palindromeno++;
                System.out.print(number + " ");
            }
        }

        System.out.println();
        System.out.println("Total Palindrome numbers: " + palindromeno);
    }


}