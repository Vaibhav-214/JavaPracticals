package com.Practical;

import java.util.Scanner;
public class Practical7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();;
        for (int i = 2; i <= input; i++) {
            if (isPrime(i) == true) {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n) {

        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
