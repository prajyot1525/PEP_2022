// Prajyotsinh Bhoite
// Write a program to reverse a string using recursion

package com.prajyot.pep.day2;
import java.util.Scanner;
public class stringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        reverse(s);
    }
    static void reverse(String s){
        if(s.length() == 0){
            return;
        }
        System.out.print(s.charAt(s.length()-1));
        reverse(s.substring(0, s.length()-1));
    }
}