// Prajyotsinh Bhoite


package com.prajyot.pep;
public class patterns {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 5-i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}