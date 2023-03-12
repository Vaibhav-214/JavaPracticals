package com.Practical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practical9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of names:");
        int n = sc.nextInt();
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names.add(sc.next());
        }

        Collections.sort(names);

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}




