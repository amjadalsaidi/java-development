package com;

import java.util.Arrays;
import java.util.Scanner;

public class pluralsight {
    public static void main( String[]args) {

        System.out.println("hello to Amjad Financial calculator");
        System.out.println("Please enter the number of these calculator\n" +
                "1. Mortgage calculator\n" +
                "2 Mortgage calculator with future value\n" +
                "3 mortgage calculator with present value");

        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.println("you choose number: "+number );

        if (number == 1) {


            System.out.println("Enter the Principal: ");
            double principal = scanner.nextDouble();



            System.out.println("Enter the Interest Rate: ");
            double interstRate = scanner.nextDouble() / 100.0;



            System.out.println("Enter the Loan Length: ");
            int years = scanner.nextInt();
            int months = years * 12;
            double monthlyInterestRate = interstRate / 12;
            double calcInterest = 1.0;

            for(int i =0; i < months; i++){
                calcInterest *= (1 + monthlyInterestRate);
            }

            double payMothly = (principal *monthlyInterestRate) / (1 - (1/calcInterest));
            double totalPayMonth = payMothly * months;
            double totalInterest = totalPayMonth - principal;

            System.out.println("Monthly Payment: "+ payMothly);
            System.out.println("Total interest paid: " + totalInterest);




        } else if (number == 2) {
            System.out.println("Enter the deposit");
            double deposit = scanner.nextDouble();
            System.out.println("Enter the interest rate");
            double interstRateForDeposit = scanner.nextDouble()/100;
            System.out.println("Enter the number of years");
            int numberOfYears= scanner.nextInt();

            double futureValue = deposit * Math.pow(1 + interstRateForDeposit, numberOfYears);
            double willBeErened = futureValue - deposit;
            System.out.println("If you deposit $" + deposit + " in a CD \n that earns " + interstRateForDeposit + "% " + " interest and \n matures in " + numberOfYears+ " your CDs ending balancing will be $"+futureValue + " and you \n would have earned $" + willBeErened + " in interest.");

        } else if (number == 3) {

        } else {
            System.out.println("You entered a wrong number. Please run the application again!");
        }



    }
}

