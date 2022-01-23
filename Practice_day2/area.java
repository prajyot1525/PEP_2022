//Prajyotsinh Bhoite
// Area of rectangle and square

package com.prajyot.pep.day2;
import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of square: ");
        int side = input.nextInt();
        System.out.println("Area of square: " + side*side);
        System.out.println("Enter the length and breadth of rectangle: ");
        int l = input.nextInt();
        int b = input.nextInt();
        System.out.println("Area of rectangle = " + l*b);
    }
}