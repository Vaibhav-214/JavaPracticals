package com.Practical;

public class Account {
    double balance;
    public static void main(String[] args) {
//        byte b = 'a';
//        int a = b;
//        System.out.println(b);
//        System.out.println(a + " " + b);
//        int x = 3;
//        int y = ++x*++x;
//        System.out.println(x+" " + y);
        Account account1=null; //Line1
        Account account2=null; //Line2
        account1 = new Account(); // Line 3
        account2 = new Account(); //Line 4
        System.out.println( account2.equals(account1));

        account2 = account1; //Line 5
        System.out.println( account2.equals(account1));
        account1 = new Account(); // Line 6
        System.out.println( account2.equals(account1));

        System.out.println(account1.balance);


    }
}
