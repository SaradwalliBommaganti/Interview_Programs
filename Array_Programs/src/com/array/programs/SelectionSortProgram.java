package com.array.programs;

import java.util.Arrays;

public class SelectionSortProgram {
    public static void main(String[] args) {
        int[] arr={24,52,63,22,66,95,11};
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

}
