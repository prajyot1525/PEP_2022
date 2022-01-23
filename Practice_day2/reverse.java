// Prajyotsinh Bhoite
// Program to reverse a number using recursion

package com.prajyot.pep.day2;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        rev(num);
        System.out.println(sum);
    }
    static int sum = 0;
    static void rev(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n/10);
    }
}