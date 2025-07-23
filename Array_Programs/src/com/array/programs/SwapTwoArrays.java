package com.array.programs;

import java.util.Arrays;

public class SwapTwoArrays {
    //example
    //temp=m
    // m=n
    // n=temp
    public static void main(String[] args){
        int[] arr={1,2,3};
        int[] arr2={4,5,6};
        int[] temp = arr;
        arr = arr2;
        arr2 = temp;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println(Arrays.toString(arr2));
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

    }


}
