package com.array.programs;

public class SumOfSmallestAndHighest {
    public static void main(String[] args) {
        int[] arr={25, 5, 45, 10, 35};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int sum=min+max;
        System.out.println("smallest and highest elemet sum:"+sum);
    }

}
