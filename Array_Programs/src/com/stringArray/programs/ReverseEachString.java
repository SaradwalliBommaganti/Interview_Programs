package com.stringArray.programs;

public class ReverseEachString {
    public static void main(String[] args) {
        String[] arr = {"apple", "bat", "car"};
       
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            String rev="";
        
        for(int j=word.length()-1;j>=0;j--){
            rev=rev+word.charAt(j);
        }
        System.out.println(rev);
       }
    }
    

}
