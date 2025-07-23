package com.array.programs;

import java.util.Arrays;

public class BubbleSortProgram {
    public static void main(String[] args) {
        int arr[]={4,6,8,4,2,5};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }


            }
        }
        System.out.println("sorted array is =" +Arrays.toString(arr));
        
    }
    
}
