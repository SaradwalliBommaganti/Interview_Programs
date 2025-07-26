package com.array.programs;

public class CopyArrayWithoutUserInput {
    public static void main(String[] args) {
        int[] originalArray={10,20,30,40,50};
        int[] copiedArray=new int[originalArray.length];
        for(int i=0;i<originalArray.length;i++){
            copiedArray[i]=originalArray[i];
        }
        System.out.println("originalArray:"); 
        for(int x:originalArray){
            System.out.println(x);
        }
        System.out.println("copied array:");
        for(int i:copiedArray){
            System.out.println(i);
        }   
    }

}
