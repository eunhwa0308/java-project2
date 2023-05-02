package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        for (String str : arr) {
            if(str.equals("0")){
                break;
            }
            System.out.println(str);

        }
    }
}
