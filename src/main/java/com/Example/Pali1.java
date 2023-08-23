package com.Example;

public class Pali1 {
    boolean isPalindrome(String x){
        String noSpaces = x.replaceAll("\\s", "").toLowerCase();

        int length = noSpaces.length();

        for(int i=0; i<=(length/2);i++){
            char frontChar = noSpaces.charAt(i);
            char backChar = noSpaces.charAt(length-(i+1));

            if (frontChar != backChar){
                return false;
            }
        }
        return true;
    }
}
