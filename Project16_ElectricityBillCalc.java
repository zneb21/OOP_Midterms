import java.util.Scanner;

public class Project16_ElectricityBillCalc {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

            double totconsumption = 0;
            double totrevenue = 0;
            double highbill = 0;
            double lowbill = 0;

        // Ask the user how many customers it has
        System.out.print("Enter number of customers: ");
        int customers = input.nextInt();

        // this repeat for every customer the user has
        for (int customer = 1; customer <= customers; customer++) {

            System.out.print("\nEnter consumption of electricity of a customer " + customer + ": ");
            double consumption = input.nextDouble();

            // bill is the variable for customer's bills
            double bill;

            //calculate the bill using a tier rates
           // if its kWh is from 1-100 kWh it would be 5 pesos per kWh
            if (consumption <= 100){
                bill = consumption * 5;

            //if its kWh is from 101-300 kWh it would be 6 pesos per kWh
           }else if(consumption <= 300){
                bill = (100 * 5) + ((consumption -100) * 6);

            //if its kWh is from 301-600 kWh it would be 7 pesos per kWh
           }else if(consumption <= 600){
                // 
                bill = (100 * 5)  + (200 * 6)  + ((consumption - 300) * 7);
            //if its kWh is above 601 kWh it would be 8 pesos per kWh
           }else {
                 bill = (100 * 5)  + (200 * 6)  + (300 * 7) + ((consumption - 600) * 8);
           }


           // Customer information display
            System.out.println("\n CUSTOMER: " + customer);
            System.out.println(" Consumption: " + consumption);
            System.out.print(" Bill:"+ bill + "pesos\n");

            // Add the total of consumptions and revenue

            totconsumption = totconsumption + consumption;
            totrevenue = totrevenue + bill;

            // find the highest and the lowest bill
            if(customer == 1){
                highbill = bill;
                    lowbill = bill;
            }else{
                if (bill > highbill){
                    highbill = bill;
                } if (bill < lowbill){
                    lowbill = bill;
                }
            }

        }

        // calculate the average bill
        double avvbill = totrevenue / customers;

        // display screen

        System.out.print("\n====== SUMMARY ======");
        System.out.print("\nCustomers: " + customers);
        System.out.print("\nTotal Consumption: " + totconsumption + "kWh");
        System.out.print("\nTotal Revenue: " + totrevenue + "pesos");
        System.out.print("\nHighest Bill: " + highbill + "pesos");
        System.out.print("\nLowest Bill: " + lowbill + "pesos");
        System.out.print("\nAverage Bill: " + avvbill + "pesos");
        
    }
}