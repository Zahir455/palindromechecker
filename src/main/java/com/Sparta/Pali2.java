package com.Sparta;

public class Pali2 {
    boolean isPalindrome(String x){

        String noSpaces = x.replaceAll("\\s", "").toLowerCase();

        StringBuilder builder = new StringBuilder(x);

        String reverse = builder.reverse().toString();

        if (!x.equals (reverse)){
            return false;
        }
        return true;
    }
}
