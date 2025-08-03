package com.stringArray.programs;

public class FindEndingWithSpecificAlphabet {
    public static void main(String[] args) {
        String[] arr = {"dog", "frog", "log", "apple", "Cat", "bag"};
        char endWith = 'g';
        int count=0;
        System.out.println("ends with charecter names '"+endWith+"':");
        for(String i:arr){
           if(i!=null&&!i.isEmpty()){
                char lastchar=Character.toLowerCase(i.charAt(i.length()-1));
                char checkchar=Character.toLowerCase(endWith);
                if(lastchar==checkchar){
                    System.out.println(i);
                    count++;
                }
           }
           

        }
        System.out.println("total count"+count);
    }

}
