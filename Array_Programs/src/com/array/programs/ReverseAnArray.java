package com.array.programs;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr={2,5,7,8};
        //approch-1
    // for(int i=arr.length-1;i>=0;i--){
    //     System.out.print(arr[i]+" ");

    // }
    //approch-2
    int start = 0;
    int end = arr.length - 1;
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    System.out.println("Reversed array:");
    for(int x:arr){
        System.out.print(x+" ");
    }

}
    

}
