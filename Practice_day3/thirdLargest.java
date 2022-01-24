// Prajyotsinh Bhoite

package com.prajyot.pep.day3;
public class thirdLargest {
    public static void main(String[] args) {
        int[] arr = {5,3,4,8,9,1,6,2,7};
        sort(arr);
            System.out.println(arr[arr.length-3]);
    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}