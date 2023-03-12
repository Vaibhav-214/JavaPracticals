package com.Practical;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        /*
        What is Scanner class?
        Scanner class is an inbuilt class in java which is part of java.util package and is used for
         reading input from various sources such as the keyboard, files, and network connections.

         Some commonly used methods of the Scanner class are:

            next(): Returns the next token or word in the input as a String.

            nextInt(): Returns the next token or word in the input as an int.

            nextDouble(): Returns the next token or word in the input as a double.

            nextLine(): Returns the next line of input as a String.

            we write below line to import Scanner class in our file

            "import java.util.Scanner;
         */

        // eg of using scanner class
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String input2 = sc.nextLine();
        int a = sc.nextInt();
        float b = sc.nextFloat();
        double c = sc.nextDouble();


        System.out.println(input);
        System.out.println(input2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
