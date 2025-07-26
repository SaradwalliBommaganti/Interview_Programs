package com.array.programs;

public class SortAnArrayUsingInsertionSort {
    public static void main(String[] args) {
        int[] arr={30,10,50,20,40};
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;

            }
            arr[j+1]=key;
        }
        System.out.println("sorted array:");
        for(int x:arr){
            System.out.print(x+" ");
        }
            
    }

}
