package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountService account = new Account();
        // do while
        do{
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Print Statement");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the amount to deposit: ");
                    int amount = scanner.nextInt();
                    account.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    int amount2 = scanner.nextInt();
                    account.withdraw(amount2);
                    break;
                case 3:
                    account.printStatement();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (true);

    }
}