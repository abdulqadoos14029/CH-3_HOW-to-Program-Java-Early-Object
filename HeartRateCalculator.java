package com.example.heartratecalculator;
import java.time.LocalDate;
import java.time.Period;

public class HeartRateCalculator {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;
    private int age;

    public HeartRateCalculator(String firstName, String lastName, int day, int month, int year){
        this.firstName=firstName;
        this.lastName=lastName;
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public void setName(String firstName, String lastName){
        this.firstName= firstName;
        this.lastName=lastName;
    }
    public String getName(){
        return firstName+"\t"+lastName;
    }


    public void setAge(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public int getAge(){
        LocalDate DOB=LocalDate.of(this.year,this.month,this.day);
        LocalDate CurrentDate= LocalDate.now();
        Period age1=Period.between(DOB,CurrentDate);
        age= age1.getYears();
        return age;
    }

    public int maxHeartRate(){
        return (220-age);
    }

    public double maxTargetHeartRate(){
        return (0.85* maxHeartRate());
    }
    public double minTargetHeartRate(){
        return (0.5* maxHeartRate());
    }

}
