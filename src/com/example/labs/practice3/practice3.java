package com.example.labs.practice3;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basicSalary, hra, tca, grossSalary;
    Employee(int i, String n, double s) {
        id = i;
        name = n;
        basicSalary = s;
        hra = s * 0.20;
        tca = s * 0.10;
        grossSalary = s + hra + tca;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("TCA: " + tca);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("------------------");
    }
}
public class practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = input.nextInt();
        input.nextLine();
        Employee[] emp = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Enter name: ");
            String name = input.nextLine();
            System.out.print("Enter basic salary: ");
            double salary = input.nextDouble();
            input.nextLine();
            emp[i] = new Employee(id, name, salary);
        }
        System.out.println("\nEmployee Salary Details:");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }
        input.close();
    }
}
