package com.array.programs;

public class FindMissingElementGivenRangeWithoutSpaces {

        public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 10};
        int start = 1;
        int end = 10;

        for (int i = start; i <= end; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {  
                    found = true;
                    break; 
                }
            }
            if (!found) {
                System.out.print(i + " ");
            }
        }
    }

}
