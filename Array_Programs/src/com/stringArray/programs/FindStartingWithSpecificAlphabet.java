package com.stringArray.programs;

public class FindStartingWithSpecificAlphabet {
    public static void main(String[] args) {
        String[] arr = {"cat", "car", "dog", "apple", "Cow", "Cycle"};
        char startWith = 'c';
        
        int count = 0;  
        
        System.out.println("Strings starting with '" + startWith + "':");

        for(int i = 0; i < arr.length; i++) {
            String word = arr[i];

            if (word != null && !word.isEmpty()) {
                char firstChar = Character.toLowerCase(word.charAt(0));
                char checkChar = Character.toLowerCase(startWith);

                if (firstChar == checkChar) {
                    System.out.println(word);  
                    count++;                   
                }
            }
        }

        System.out.println("Total count: " + count);
    }
}
