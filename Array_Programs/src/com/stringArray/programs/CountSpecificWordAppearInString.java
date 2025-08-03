package com.stringArray.programs;

public class CountSpecificWordAppearInString {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "orange", "apple"};
        String target = "apple";
        int count=0;
        for (String word : arr) {
            if(word!=null&&word.equals(target)){
                count++;
                
            }
            
        }
        System.out.println("the word apple appear "+count+" times");
    }

}
