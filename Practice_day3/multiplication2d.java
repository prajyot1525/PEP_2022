// Prajyotsinh Bhoite

package com.prajyot.pep.day3;
import java.util.Scanner;
public class multiplication2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of 1st 2D array: ");
        int size1 = input.nextInt();
        int[][] arr1 = new int[size1][size1];
        System.out.println("Enter the size of 2nd 2D array: ");
        int size2 = input.nextInt();
        int[][] arr2 = new int[size2][size2];
        System.out.println("Enter the values elements of 1st Array: ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size1; j++) {
                arr1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the values elements of 2nd Array: ");
        for (int i = 0; i < size2; i++) {
            for (int j = 0; j < size2; j++) {
                arr2[i][j] = input.nextInt();
            }
        }
        int[][] arrSum = product(arr1, arr2, size1);
        System.out.println("Result: ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(arrSum[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
    static int[][] product(int[][] a1, int[][] a2, int s){
        int[][] arrProd  = new int[s][s];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                arrProd[i][j] = a1[i][j] * a2[i][j];
            }
        }

        return arrProd;
    }
}