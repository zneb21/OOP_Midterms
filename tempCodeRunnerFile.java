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

        for (int number = startno; number <= endno; number++) {

            //Prime
            boolean prime = true;

            for (int div1 = 2; div1 < number; div1++){
                if (number % div1 == 0){
                    prime = false;
                    break;
                }
            }

            if (prime){
                primeno++;
                System.out.println("Prime number: " + number);
            }

            //Perfect
            int divsum = 0;

                for (int div2 = 1; div2 < number; div2++){
                    if (number % div2 ==  0){
                        divsum = divsum + div2;
                    }
                }

                if (divsum == number){
                    perfectno++;
                    System.out.println("Perfect number: " + number);
                }
                
            //Armstrong
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
                System.out.println("Armstrong number: " + number);
            }

            
            //Palindrome
            int rev = 0;
            int temp2 = number;

            while (temp2 < 0){
                int digit2 = temp2 % 10;
                rev = rev * 10 + digit2;
                temp2 = temp2 / 10;
            }

            if (rev == number){
                palindromeno++;
                System.out.println("Palindrome number: " + number);
            }

        }


        // Displaying the totals on what the user give using the counter
        System.out.println("Total Prime number: " + primeno);
        System.out.println("Total Perfect number: " + perfectno);
        System.out.println("Total Armstrong number: " + armstrongno);
        System.out.println("Total Palindrome number: " + palindromeno);


          
    }
}