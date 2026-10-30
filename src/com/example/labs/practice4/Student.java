package com.example.labs.practice4;

public class Student {
    
    private String name, ID;
    private float[] scores = new float[5];
    private float sum = 0.0f, average=0.0f;
    //Student constructor with params accepting the student name, ID, and an array of scores.
    Student(String name, String ID, float[] scores){
        this.name = name;
        this.ID = ID;
        this.scores = scores;
    }
    //Getter functions for name, ID, and scores alongside the sum and avg.
    public String nameGetter(){
        return this.name;
    }
    public String IDGetter(){
        return this.ID;
    }
    public float scoresGetter(int index){
        return this.scores[index];
    }
    public float sumGetter(){
        return this.sum;
    }
    public float averageGetter(){
        return this.average;
    }
    public void scoreSetter(){

    }
    //Honestly just added this to make the code alot easier to read.
    public void calcSumAndAverage(){
        for(float i : this.scores){
            this.sum += i;
        }
        this.average = this.sum/5.0f;
    }
    //Grade determiner function.
    public char gradeDetermine(){
        if(this.average >= 90.0f){
            return 'A';
        }else if (this.average >= 75.0f){
            return 'B';
        }else if (this.average >= 50.0f){
            return 'C';
        }else{
            return 'F';
        }
    }
}
