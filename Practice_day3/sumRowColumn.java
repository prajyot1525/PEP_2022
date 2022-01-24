// Prajyotsinh Bhoite

package com.prajyot.pep.day3;

public class sumRowColumn {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4,5,26},
                {6,7,8,9,10,27},
                {11,12,13,14,15,28},
                {16,17,18,19,20,29},
                {21,22,23,24,25,30}
        };
        rowSum(matrix);
        colSum(matrix);
    }
    static void rowSum(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of row " + i + " is : " + sum);
        }
    }

    static void colSum(int[][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            System.out.println("Sum of column " + i + " is : " + sum);
        }
    }
}