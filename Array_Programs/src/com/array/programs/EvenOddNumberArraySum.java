package com.array.programs;

public class EvenOddNumberArraySum {

    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5};
        
        int sum=0,sum1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
             sum=sum+arr[i];
             
            }
            else{
               sum1+=arr[i];
            
            }
        }
         System.out.println("Even numbers sum:"+sum);
         System.out.println("Odd numbers sum:"+sum1);
    }
       
    

}
