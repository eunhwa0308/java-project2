package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        for (int c = 'a' ; c <= input  ; c++) {
            System.out.printf("%c ",c);

        }
    }
}
