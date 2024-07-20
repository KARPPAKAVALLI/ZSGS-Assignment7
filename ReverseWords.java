package com.assignment7;

import java.util.Scanner;

public class ReverseWords {
    //3. Write a program to reverse the words in a sentence.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s[]=sc.nextLine().split(" ");
        int left=0,right=s.length-1;
        while (left<=right){
            String temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        System.out.println("The string with words reversed: ");
        for (String i:s){
            System.out.print(i+" ");
        }
    }
}
