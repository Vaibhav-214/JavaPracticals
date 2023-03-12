package com.Practical;
import java.util.*;


public class Pracal1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,7,5};
        System.out.println(subarraySum(arr, 5, 12));
    }
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
    int sum = 0;
    int first = 0;
    int j = 0;

    ArrayList<Integer> list = new ArrayList<Integer>(2);

    while(j < n || s != 0 || n != 0) {

        sum = sum + arr[j];
        if (sum < s) {
            j++;
            continue;
        }else if (sum == s) {
            list.add(first + 1);
            list.add(j + 1);
            return list;
        } else if (sum > s && j != n-1 ) {
            sum = sum - arr[first++];
            if(sum == s) {
                list.add(first + 1);
                list.add(j+1);
                return list;
            }
            j++;
        }
    }
    list.add(-1);
    return list;
}

}
