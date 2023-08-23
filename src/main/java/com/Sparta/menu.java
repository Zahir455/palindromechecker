package com.Sparta;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    public static String[] splitter(){
        String example=("madam please refer to the user manual before driving your new honda civic");
        String[] words = example.split(" ");
        return words;
    }

    public String tester() {
        Scanner input = new Scanner(System.in);
        String[] words = splitter();
        String result = "The palidromes are ";

        System.out.println("which palindrome tester would you like to use, 1, 2 or 3?");
        String choice = input.next();

        switch (choice) {
            case "1":
            Pali1 check1 = new Pali1();

            for (int i = 0; i < (words.length); i++) {
                String currentword = words[i];
                if (check1.isPalindrome(currentword) == true){
                    result = result + currentword + " ";
                }
            }
        break;
        case "2":
            Pali2 check2 = new Pali2();

            for (int i = 0; i < (words.length); i++) {
                String currentword = words[i];
                if (check2.isPalindrome(currentword) == true) {
                    result = result + currentword + " ";
                }
            }
            break;
        case "3":
            Pali3 check3 = new Pali3();

            for (int i = 0; i < (words.length); i++) {
                String currentword = words[i];
                if (check3.isPalindrome(currentword) == true) {
                    result = result + currentword + " ";
                }
            }
            break;
        default:
            System.out.println(choice + " is not a valid tester");
            System.exit(1);
            break;
        }
        System.out.println(result);
        return result;
    }
}
