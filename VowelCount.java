package com.assignment7;

import java.util.Locale;
import java.util.Scanner;

public class VowelCount {
    //1. Create a program to count vowels in a given string using string functions
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine().toLowerCase();
        String vowel="aeiou";
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(vowel.contains(""+s.charAt(i)))
                count++;
        }
        System.out.println("The count of vowels in the given string is: "+count);
    }
}
