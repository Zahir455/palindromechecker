package com.Sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {

    }

    @Test
    void Test1(){
        Pali1 check = new Pali1();
        Assertions.assertTrue(check.isPalindrome("abccba"));
    }

    @Test
    void Test2(){
        Pali1 check = new Pali1();
        Assertions.assertFalse(check.isPalindrome("acbacb"));
    }

    @Test
    void Test3(){
        Pali2 check = new Pali2();
        Assertions.assertTrue(check.isPalindrome("abccba"));
    }

    @Test
    void Test4(){
        Pali2 check = new Pali2();
        Assertions.assertFalse(check.isPalindrome("acbacb"));
    }

    @Test
    void Test5(){
        Pali3 check = new Pali3();
        Assertions.assertTrue(check.isPalindrome("abccba"));
    }

    @Test
    void Test6(){
        Pali3 check = new Pali3();
        Assertions.assertFalse(check.isPalindrome("acbacb"));
    }

    @Test
    void Test7(){
        menu menu = new menu();
        menu.tester();
    }
}