package com.example.javaproject2.week3.day1;

public class MultiplicationTableStep3 {

    public static void printDan(int dan){
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("%d * %d = %d\n",dan,i,dan*i);
        }
        System.out.println("--------------------------");
    }
    public static void main(String[] args) {
        /*
        for (int j = 2; j < 4; j++) {
            for (int i = 1; i <= 9 ; i++) {
                System.out.printf("%d * %d = %d\n",j,i,j*i);
            }
            System.out.println("-------------------------");
        }*/

        printDan(2);
        printDan(4);
        printDan(6);
    }
}
