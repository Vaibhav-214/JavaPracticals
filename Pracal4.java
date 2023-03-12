package com.Practical;

import java.util.Scanner;

public class Pracal4 {
    public static void main(String[] args) {
        int arr []= new int [10];
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Taking input");
        for (int i = 0 ; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Printing output");
        for(int e : arr) {
            System.out.println(e);
        }

    }
}
