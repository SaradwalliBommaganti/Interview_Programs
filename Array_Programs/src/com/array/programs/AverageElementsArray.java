package com.array.programs;

import java.util.Scanner;

public class AverageElementsArray {
    public static void main(String args[]){
        System.out.print("Enter size of the array: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] arr=new int[size];
        int sum=0;
        double avg;
        System.out.println("Enter " + size + " numbers:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
           
           

        }
          avg=sum/arr.length;

      
        System.out.println("Average = " + avg);
        
    }
    
}
