package com.example.labs;

import java.util.Scanner;

class Temperature {
    double celsius;
    double fahrenheit;

    void setTemperature(double c) {
        celsius = c;
    }
    void convert() {
        fahrenheit = (celsius * 9.0 / 5.0) + 32;
    }
    void display() {
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
public class practice2 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            Temperature temp = new Temperature();

            System.out.print("Enter Celsius temperature for city "
                    + i + ": ");
            double c = input.nextDouble();

            temp.setTemperature(c);
            temp.convert();

            System.out.println("City " + i);
            temp.display();
            System.out.println();
        }
        input.close();
    }
}

