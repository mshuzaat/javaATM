package com.shuzam;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        int balance = 5000, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while (true)
        {
            System.out.println("Automated Teller Machine ");
            System.out.println("Type 1 for  Withdraw ");
            System.out.println("Type 2 for Deposit ");
            System.out.println("Type 3 for Check Balance ");
            System.out.println("Type 4 for EXIT ");
            System.out.println("Choose the operation you want to perform: ");
            int n = s.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("Enter the amount to be withdrawn: ");
                    withdraw = s.nextInt();
                    if (balance >= withdraw)
                    {
                        balance = balance-withdraw;
                        System.out.println("Please colect your money. ");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance ");
                    }
                    System.out.println("  ");
                    break;

                case 2:
                     System.out.println("Enter money to be deposite: ");
                     deposit = s.nextInt();
                     balance = balance+deposit;
                     System.out.println("Your money has been successfully deposit ");
                     System.out.println("  ");
                     break;

                case 3:
                    System.out.println("Balance : "+balance);
                    System.out.println("  ");
                    break;

                case 4:
                    System.exit(0);

            }
        }
    }
}
