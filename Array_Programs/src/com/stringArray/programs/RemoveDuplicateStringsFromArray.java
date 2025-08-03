package com.stringArray.programs;

public class RemoveDuplicateStringsFromArray {
    public static void main(String[] args) {
        String[] arr = {"apple", "bat", "apple", "cat", "bat"};
       
        for(int i=0;i<arr.length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<i;j++){
                if(arr[i].equals(arr[j])){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.println(arr[i]);
            }
    }

}
}
