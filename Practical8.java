package com.Practical;
public class Practical8 {
    public static void main(String[] args) {

        int[][] firstMatrix = { {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}
                            };

        int[][] secondMatrix = {{2, 0, 4},
                                {3, 6, 2},
                                {1, 1, 1}
                            } ;

        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        System.out.println("Result matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

