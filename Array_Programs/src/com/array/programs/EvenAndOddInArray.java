package com.array.programs;

public class EvenAndOddInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        String evenNum=" ";
        String oddNum=" ";
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
               evenNum+=arr[i]+", ";
            }
            else{
                oddNum+=arr[i]+" ,";
            
            }
        }
         System.out.println("Even numbers:"+evenNum);
         System.out.println("Odd numbers:"+oddNum);
    }


}
