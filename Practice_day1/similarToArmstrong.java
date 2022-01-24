// Prajyotsinh Bhoite

package com.prajyot.pep;
import java.util.Scanner;
public class similarToArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        for (int i = n1; i <= n2; i++) {
            int num = i;
            int arm = 0;
            int k = digits(i);
            for (int j = 0; j < k; j++) {
                int l = num%10;
                num /= 10;
                arm += Math.pow(l, k);
            }
            if(i == arm){
                System.out.println(i);
            }
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