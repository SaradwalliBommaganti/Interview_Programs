package com.array.programs;

public class SumElementsInArray {
    public static void main(String args[]){
        int arr[]={1,2,3};
        int sum=0;
        for(int x:arr){
            sum=sum+x;
           
        }
         System.out.println("sum: "+sum);
    }
}
