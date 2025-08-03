package com.stringArray.programs;



public class LongestAndShortestStringsInArray {
    public static void main(String[] args) {
        String[] arr = {"cat", "dog", "elephant", "hi", "zebra"};
        String shortest=arr[0];
        String largest=arr[0];
        for(int i=1;i<arr.length;i++){
            String word=arr[i];
            if(word.length()>largest.length()){
                largest=word;
            }
            if(shortest.length()>word.length()){
                shortest=word;
            }
        }
        System.out.println("longest String:"+largest);
        System.out.println("shortest String:"+shortest);
    }

}
