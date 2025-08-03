package com.stringArray.programs;

public class ConcatenateAllStringsInArrays {
    public static void main(String[] args) {
        String[] arr = {"Hi", "there", "friend"};
        String result="";
        for(String word:arr){
            result+=word;
        }
        System.out.println(result);
    }

}
