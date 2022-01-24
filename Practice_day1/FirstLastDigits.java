// Prajyotsinh Bhoite

package com.prajyot.pep;
import java.util.Scanner;
public class firstLastDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int digits = digits(num);
        for (int i = 1; i <= digits; i++) {
            if(i == 1){
                int Last = num%10;
                System.out.println("Last digit "+Last);
            }
            else if(i == digits){
                int First = num%10;
                System.out.println("Last digit "+First);
            }
            num /= 10;

        }
    }

    static int digits(int num){
        int i = 0;
        do {
            num /= 10;
            i++;
        }while(num >= 1);
        return i;
    }
}