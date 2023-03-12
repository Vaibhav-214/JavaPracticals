package com.Practical;

public class Practical10 {
    public static void main(String[] args) {
        OverloadingExample obj1 = new OverloadingExample();
        OverloadingExample obj2 = new OverloadingExample(10, 20);

        System.out.println( obj1.add(10, 20) );
        System.out.println( obj2.add(10, 20, 30) );
    }
}
class OverloadingExample {
    int a, b;
    OverloadingExample() {
        a = 0;
        b = 0;
    }
    OverloadingExample(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}



