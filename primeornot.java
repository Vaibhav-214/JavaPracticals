package com.Practical;

import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= (int)Math.sqrt(input); i++) {
            if (input % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true) {
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is not prime");
        }


    }
}
