package com.assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Capitalize {
    //5. Write a program to capitalize the first letter of each words in a sentence.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s[]=sc.nextLine().split(" ");
        System.out.println("The sentence with the first as capital for each word:");
        for (int i=0;i<s.length;i++){
            s[i]=Character.toUpperCase(s[i].charAt(0))+s[i].substring(1);
            System.out.print(s[i]+" ");
        }
    }
}
