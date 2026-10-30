package com.example.labs.practice4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class StudentGrades{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, ID;
        String[] subject = {"Mathematics", "Physics", "Chemistry", "Biology", "English"};
        int numberOfStudents;
        List<Student> students = new ArrayList<>();

        System.out.print("Enter the amount of students: ");
        numberOfStudents = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < numberOfStudents; i++){
            //Accept information of each student.
            System.out.println("+==============================================+");
            System.out.print("Enter name: ");
            name = sc.nextLine();
            System.out.print("Enter ID: ");
            ID = sc.nextLine();
            float[] scores = new float[5];
            for(int j = 0; j < 5; j++){
                System.out.printf("Enter your score for %s: ", subject[j]);
                scores[j] = sc.nextFloat();
            }
            sc.nextLine();
            //Adds a new student into the list. and calculates sum and avg.
            students.add(new Student(name, ID, scores));
            students.get(i).calcSumAndAverage();
        }
        System.out.println("END=============================================\n");
        System.out.println("Evaluating results...");
        System.err.println("Printing...");
        for(int i = 0; i < numberOfStudents; i++){
            System.out.println("\n===========================================");
            System.out.printf("%s (%s), here are your scores: \n",students.get(i).nameGetter(),students.get(i).IDGetter());
            for(int j = 0; j < 5; j++){
                System.out.printf("\t%s: %.2f\n", subject[j], students.get(i).scoresGetter(j));
            }
            System.out.printf("\tTotal Marks: %.2f\n", students.get(i).sumGetter());
            System.out.printf("\tAverage: %.2f\n", students.get(i).averageGetter());
            System.out.printf("\tYour letter grade: %c\n", students.get(i).gradeDetermine());
            System.out.println("============================================");
        }
        sc.close();
    }
}