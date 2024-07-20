package com.assignment7;

import java.util.Scanner;

public class ReverseString {
    //2. Write a program to reverse the characters of a string.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println("The reversed string"+sb);
    }
}
