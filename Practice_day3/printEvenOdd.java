// Prajyotsinh Bhoite   

package com.prajyot.pep.day3;
import java.util.Arrays;
public class printEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9,11,34,46,23,63,72};
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                evenCount++;
            }
        }
        int[] even = new int[evenCount];
        int e = 0;
        int[] odd = new int[arr.length - evenCount];
        int o = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                even[e] = arr[i];
                e++;
            }
            else {
                odd[o] = arr[i];
                o++;
            }
        }
        System.out.println( "Even : " + Arrays.toString(even));
        System.out.println( "Odd : " + Arrays.toString(odd));
    }
}