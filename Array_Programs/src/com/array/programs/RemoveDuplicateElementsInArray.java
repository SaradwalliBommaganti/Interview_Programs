package com.array.programs;

public class RemoveDuplicateElementsInArray {

      public static void main(String[] args) {
         int[] arr = {3, 5, 2, 3, 7, 5, 9, 2, 5};
         System.err.println("without duplicates are:");
         for(int i=0;i<arr.length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                     isDuplicate=true;
                     break;
                    
                }
            }
            if(!isDuplicate){
                System.out.print(arr[i]+" ");
            }
         }
    }

}
