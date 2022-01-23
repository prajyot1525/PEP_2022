// Prajyotsinh Bhoite
// Write a program to calculate grades of a student

package com.prajyot.pep.day2;
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("name: ");
        String name = input.nextLine();
        System.out.print("Roll number: ");
        int roll = input.nextInt();
        System.out.print("Marks: ");
        int marks = input.nextInt();
        if (isBetween(marks, 90, 100)){
            System.out.println("Grade: O");
        }
        else if (isBetween(marks, 80, 89)){
            System.out.println("Grade: A1");
        }
        else if (isBetween(marks, 70, 79)){
            System.out.println("Grade: A2");
        }
        else if (isBetween(marks, 60, 69)){
            System.out.println("Grade: B1");
        }
        else if (isBetween(marks, 50, 59)){
            System.out.println("Grade: B2");
        }
        else if (isBetween(marks, 40, 49)){
            System.out.println("Grade: C1");
        }
        else if (isBetween(marks, 34, 39)){
            System.out.println("Grade: P");
        }
        else System.out.println("Grade: F");

    }
    static boolean isBetween(int x, int lower, int upper){
        return lower <= x && x <= upper;
    }
}