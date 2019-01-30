package com.company;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println("Please enter the string to be reversed");
        Scanner sc = new Scanner(System.in);
        String reverseThis = sc.nextLine();

        char[] revArray = reverseThis.toCharArray();
        for (int i = revArray.length - 1; i > -1; i--){
            System.out.print(revArray[i]);
        }
        sc.close();
    }
}
