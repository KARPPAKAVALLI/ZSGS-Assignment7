package com.assignment7;

import java.util.Scanner;

public class EmailValidate {
    //4. Write a program to validate email address (contains @ and proper domain format). Note: Don't use regular expressions
    public static boolean isValidEmail(String email) {
        // Checking if there is exactly one @
        int at = email.indexOf('@');
        if (at == -1 || email.indexOf('@', at + 1) != -1) {
            return false;
        }
        // Split the email into local part and domain part
        String local = email.substring(0, at);
        String domain = email.substring(at + 1);

        // Check if local part is not empty
        if (local.isEmpty()) {
            return false;
        }

        // Check if domain part has at least one dot and is not at the start or end
        int dotIndex = domain.indexOf('.');
        if (dotIndex == -1 || domain.startsWith(".") || domain.endsWith(".")) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter email:");
        String email=sc.nextLine();
        if(isValidEmail(email))
            System.out.println("The entered email is Valid.");
        else
            System.out.println("The entered email is Invalid.");
    }
}
