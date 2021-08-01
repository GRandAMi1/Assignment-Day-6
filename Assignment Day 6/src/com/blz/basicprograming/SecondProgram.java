package com.blz.basicprograming;

import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args) {
        System.out.print("Enter your number to check for Perfect number : ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < userInput; i++) {
            if (userInput % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == userInput) {
            System.out.println(userInput + " is a Perfect Number");
        } else {
            System.out.println(userInput + " is not a Perfect Number");
        }
    }
}
