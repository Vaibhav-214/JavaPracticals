package com.Practical;

public class Practical3 {
    public static void main(String[] args) {
        ArithmeticOperations arithmeticObject = new ArithmeticOperations();

        System.out.println("4 + 6 = " + arithmeticObject.addition(4,6) );
        System.out.println("10 - 8 = " + arithmeticObject.subtraction(10,8) );
        System.out.println("4 * 5 = " + arithmeticObject.multiplication(4,5) );
        System.out.println("25 / 5 = "+ arithmeticObject.division(25,5) );

        BitwiseOperations bitwiseObject = new BitwiseOperations();

        System.out.println("5 | 7 = " + bitwiseObject.bitwiseOR(5,7) );
        System.out.println("5 & 7" + bitwiseObject.bitwiseAND(5,7) );
        System.out.println("5 ^ 7 = " + bitwiseObject.bitwiseXOR(5,7) );
        System.out.println("~5 = " + bitwiseObject.bitwiseComplement(5) );
    }
}
class ArithmeticOperations {
    int addition(int num1, int num2) {
        return num1 + num2;
    }
    int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    int multiplication(int num1, int num2) {
        return num1*num2;
    }
    int division(int num1, int num2) {
        return num1 / num2;
    }
}

class BitwiseOperations {
    int bitwiseOR(int num1, int num2) {
        return num1 | num2;
    }
    int bitwiseAND(int num1, int num2) {
        return num1 & num2;
    }
    int bitwiseXOR(int num1, int num2) {
        return num1 ^ num2;
    }
    int bitwiseComplement(int num1) {
        return ~num1;
    }
}