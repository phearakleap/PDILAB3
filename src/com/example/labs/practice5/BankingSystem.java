package com.example.labs.practice5;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BankingSystem {
    
    public static Account findAccount(List<Account> accounts, String accNum){
        for(Account acc : accounts){
            if (acc.accNumGetter().equals(accNum)){
                return acc;
            }
        }
        return null;
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();
        System.out.print("Welcome to our Banking System! Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();
 
        for (int i = 0; i < n; i++) {
            System.out.println("\nCustomer #" + (i + 1));
            String accNo;
            while (true) {
                System.out.println("+==================================================+");
                System.out.print("Account Number (must be 14 digits long): ");
                accNo = sc.nextLine().trim();
                if (accNo.matches("\\d{14}")) break; //Java doesn't have .size :(
                System.out.println("Invalid! Must be exactly 14 digits.");
            }
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Balance: ");
            float balance = sc.nextFloat();
            sc.nextLine();
            accounts.add(new Account(accNo, name, balance));
        }

        int choice;
        do {
            System.out.println("\n==================== BANK  MENU ====================");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display all accounts");
            System.out.println("0. Exit");
            System.out.println("====================================================");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();
 
            if (choice == 1 || choice == 2) {
                System.out.print("Enter account number: ");
                String accNo = sc.nextLine().trim();
                Account acc = findAccount(accounts, accNo);
 
                if (acc == null) {
                    System.out.println("Account not found, double check the entered Account Number.");
                    continue;
                }
 
                System.out.print("Enter amount: ");
                float amount = sc.nextFloat();
                
 
                if (choice == 1) acc.deposit(amount);
                else acc.withdraw(amount);
                sc.nextLine();
                System.out.println("====================================================");
                System.out.println("Updated account details:");
                System.out.printf("\tUsername: %s\n", acc.nameGetter());
                System.out.printf("\tAccount Number: %s\n", acc.accNumGetter());
                System.out.printf("\tCurrent Balance: %.2f\n", acc.balGetter());
                System.out.println("====================================================");
            } else if (choice == 3) {
                for (Account acc : accounts){
                    System.out.println("====================================================");
                    System.out.printf("\tUsername: %s\n", acc.nameGetter());
                    System.out.printf("\tAccount Number: %s\n", acc.accNumGetter());
                    System.out.printf("\tCurrent Balance: %.2f\n", acc.balGetter());
                    System.out.println("====================================================");
                }
            }
        } while (choice != 0);
 
        System.out.println("Thank you for using our banking system!");
        System.out.println("Exiting...");
        sc.close();
    }
}
