package com.stringArray.programs;

import java.util.Arrays;

public class TwoStringArraysAreEqual {
    public static void main(String[] args) {
        String[] arr1 = {"apple", "bat", "cat"};
        String[] arr2 = {"apple", "bat", "cat"};
        if(Arrays.equals(arr1, arr2)){
            System.out.println("to strings are equal");
        }else{
            System.out.println("to strings are not equal");
        }
    }

}
