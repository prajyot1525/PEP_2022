// Prajyotsinh Bhoite

package com.prajyot.pep.day3;

public class printArrayUsingRecursion {
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7,8,9,10};
        print(arr);
    }
    static int i = 0;
    static void print(int[] arr) {
        if(i == arr.length){
            return;
        }
        System.out.print(arr[i] + " ");
        i++;
        print(arr);
    }


}