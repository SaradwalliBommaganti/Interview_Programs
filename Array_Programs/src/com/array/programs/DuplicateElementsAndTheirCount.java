package com.array.programs;

public class DuplicateElementsAndTheirCount {

        public static void main(String[] args) {
        int[] arr = {3, 5, 2, 3, 7, 5, 9, 2, 5};
        int count=1;
        
        for(int i=0;i<arr.length;i++){
             if(arr[i]==-1){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }

            }
            if(count>1){
                System.out.println(arr[i]+"->"+count+"times");
            }

           
                
        }

}
}
