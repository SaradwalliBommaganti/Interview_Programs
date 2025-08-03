package com.stringArray.programs;

public class FindPalindromeStrings {
    public static void main(String[] args) {
        String[] arr = {"madam", "cat", "civic", "apple"};
        
        for(String word:arr){
            String rev="";
            for(int j=word.length()-1;j>=0;j--){
                rev=rev+word.charAt(j);
                
            }
            if(rev.equals(word)){
                    System.out.println(word);
                }
        }

    }

}
