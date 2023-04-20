package com.example.javaproject2.week1;

public class Multiplicationtable {
    public static void main(String[] args) {
        //System.out.println("2"+"*"+"2"+"="+"4");

        System.out.printf("%d * %d = %d\n",2,1,2);
        System.out.printf("%d * %d = %d\n",2,2,4);
        System.out.printf("%d * %d = %d\n",2,3,6);
        System.out.printf("%d * %d = %d\n",2,4,8);
        System.out.printf("%d * %d = %d\n",2,5,10);
        System.out.printf("%d * %d = %d\n",2,6,12);
        System.out.printf("%d * %d = %d\n",2,7,14);
        System.out.printf("%d * %d = %d\n",2,8,16);
        System.out.printf("%d * %d = %d\n",2,9,18);

        //반복문 사용
        for(int i = 2; i < 10 ; i++ ){
            for (int j = 1; j < 10 ; j++){
                System.out.printf("%d * %d = %d\t",i,j,i*j);
            }
            System.out.println("");
        }
    }
}
