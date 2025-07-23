package com.array.programs;

public class CreateTypesOfArray {

    public static void main(String args[]){
        //int arr[]={2,3,5,6,};
        int arr[]=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        // approch-1
        //System.out.println(Arrays.toString(arr));
        //approch-2
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // approch-3
        for(int x:arr){
            System.out.println("arrays using for each::"+x);
        }

    }

 
}


