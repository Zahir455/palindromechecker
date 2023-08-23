package com.Sparta;

public class Pali3 {
    boolean isPalindrome(String x){
        String noSpaces = x.replaceAll("\\s", "").toLowerCase();

        int length = noSpaces.length();

        int front = 0;
        int back = length-1;

        while (back>front){
            if(noSpaces.charAt(front)!= (noSpaces.charAt(back))){
                return false;
            } else{
                back--;
                front++;
            }
        }
        return true;
    }
}
