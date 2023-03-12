package com.Practical;


public class Pracal3 {
    public static void main(String[] args) {
        System.out.println(BalancedString(11));
        System.out.println(BalancedString(33));
        System.out.println(BalancedString(29));
        System.out.println(BalancedString(10));

    }
    public static String BalancedString(int N){
        String str = "";
        if (N % 2 == 0) {
            while (N > 0) {
                if (N < 26) {
                    str += N_even(N);
                    break;
                } else {
                    str += N_even(26);
                    N = N - 26;
                }
            }
        } else {
            if (sum(N) % 2 == 0) {
                while (N > 0) {
                    if (N < 26) {
                        str += N_ODD_Sumeven(N);
                        break;
                    } else {
                        str += N_even(26);
                        N = N - 26;

                    }
                }
            } else {
                while (N > 0) {
                    if (N < 26) {
                        str += N_ODD_Sumodd(N);
                        break;
                    } else {
                        str += N_even(26);
                        N = N - 26;
                    }
                }
            }
        }
        return str;
    }
    public static String N_ODD_Sumodd(int n) {
        String str = "";
        char first = 'a';
        char second = 'z';//26
        second -= (n-1)/2;
        for (int i = 1; i <= (n-1)/2; i++) {
            str += first;
            first++;
        }
        for (int i = (n-1)/2; i < n; i++) {
            str += second;
            second++;
        }
        return str;
    }


    public static String N_ODD_Sumeven(int n) {
        String str = "";
        char first = 'a';
        char second = 'z';//26
        second -= (n-1)/2 ;
        second += 1;
        for (int i = 1; i <= (n+1)/2; i++) {
            str += first;
            first++;
        }
        for (int i = ((n-1)/2); i < n - 1; i++) {
            str += second;
            second++;
        }

        return str;
    }

    public static String N_even(int n) {
        String str = "";
        char first = 'a';
        char second = 'z';//26
        second -= (n/2);
        second += 1;
        for(int i = 1; i <= n/2; i++ ) {
            str += first;
            first++;
        }
        for (int i = (n/2) + 1; i<= n; i++) {
            str += second;
            second++;
        }
        return str;
    }
    static int sum(int N) {

        int sum =0;
        while(N>0){
            int remainder = N%10;
            sum+= remainder;
            N/=10;
        }
        return sum;
    }

}
