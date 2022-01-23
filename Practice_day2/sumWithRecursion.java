// Prajyotsinh Bhoite
// Sum of n natural numbers using recursion

package com.prajyot.pep.day2;
import java.util.Scanner;
public class sumWithRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        sum(num);
        System.out.println(result);
    }
    static int result = 0;
    static void sum(int n){
        if(n == 0){
            return;
        }
        result += n;
        n--;
        sum(n);
    }
}