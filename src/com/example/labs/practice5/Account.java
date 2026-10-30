package com.example.labs.practice5;

public class Account {
    public String accNum;
    private float balance = 0.0f;
    private String name;

    Account(String accNum, String name, float balance){
        this.accNum = accNum;
        this.name = name;
        this.balance = balance;
    }
    public String accNumGetter(){
        return this.accNum;
    }
    public float balGetter(){
        return this.balance;
    }
    public String nameGetter(){
        return this.name;
    }
    public void withdraw(float amount){
        if(amount > this.balance){
            System.out.println("Withdrawal amount exceeded current balance.");
        } else {
            this.balance -= amount;
            System.out.printf("\nWithdrew %.2f from %s (%s) successfully!\n", amount, this.name, this.accNum);
        }
    }
    public void deposit(float amount){
        this.balance += amount;
    }
}
