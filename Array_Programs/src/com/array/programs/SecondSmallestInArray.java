package com.array.programs;

public class SecondSmallestInArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<first){
                second=first;
                first=arr[i];
            
            }
            else if(arr[i]<second&&arr[i]!=first){
                second=arr[i];

            }
        }
        System.out.println("second smallest element:"+second);
    }

}
