package com.example.javaproject2.week2.day5;

public class GetGrade2 {
    public static void main(String[] args) {
        int score = 95;
        if (score >= 70) { // false
            System.out.println("A");
        } else if (score >= 80) { // false
            System.out.println("B");
        } else if (score >= 90) { // true
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}
