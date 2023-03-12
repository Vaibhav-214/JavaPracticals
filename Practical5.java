package com.Practical;

import java.util.Scanner;

public class Practical5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a, b and c");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        double  discriminate = Math.sqrt(b*b - 4*a*c);
        if (discriminate < 0) {
            System.out.println("There are no real solutions");
        } else {
            double solution1 = (-b - discriminate)/( 2 * a);
            double solution2 = (-b + discriminate)/ (2 * a);
            System.out.println("The real solutions are "+solution1 + " and " + solution2);
        }
    }
}
