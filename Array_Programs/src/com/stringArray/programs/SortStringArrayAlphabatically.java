package com.stringArray.programs;

public class SortStringArrayAlphabatically {
    public static void main(String[] args) {
        String[] arr = {"zebra", "apple", "bat"};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        for (String str : arr) {
            System.out.println(str);
        }

    }


}
