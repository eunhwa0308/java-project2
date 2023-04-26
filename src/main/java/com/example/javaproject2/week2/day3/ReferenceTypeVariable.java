package com.example.javaproject2.week2.day3;

import com.example.javaproject2.week1.day2.PrintHello;

public class ReferenceTypeVariable {
    public static void main(String[] args) {
        Student student = new Student(); //new를 써서 Student객체를 인스턴스로

        Student[] students = new Student[30];

        Object obj = new Student();
        Object obj2 = new PrintHello();
    }
}
