package com.example.heartratecalculator;

import java.util.Scanner;

public class HeartRateCalculatorTest {
    public static void main(String[] args){
        //Scanner input= new Scanner(System.in);
        HeartRateCalculator patient1= new HeartRateCalculator("Abdul","Qadoos",18,06,1997);
        System.out.printf("Patient Name: %s %n", patient1.getName());
       // System.out.printf("Patient Age: %d %n",patient1.getAge());
        System.out.print("Patient Age: ");
        System.out.println(patient1.getAge());
        System.out.printf("Max Heart Rate (BPM): %d %n",patient1.maxHeartRate());
        System.out.print("Max Target Heart Rate: ");
        System.out.println(patient1.maxTargetHeartRate());
        System.out.print("Min Target Heart Rate: ");
        System.out.println(patient1.minTargetHeartRate());

    }
}
