package com.Practical;

public class Practical6 {
    public static void main(String[] args) {
        System.out.println("Solution using Non - Recursive Fibonacci for n = 8 is "+ nonRecursiveFibonacci(8));
        System.out.println("Solution using Recursive Fibonacci for n = 8 is " + recursiveFibonacci(8));
    }
    public static int recursiveFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }else {
            return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
        }
    }
    public static int nonRecursiveFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }else {
            int num2 = 1;
            int num1 = 1;
            int answer = num1 + num2;
            for (int i = 3; i <= n; i++) {
                answer = num1 + num2;
                num2 = num1;
                num1 = answer;
            }
            return answer;
        }
    }
}
