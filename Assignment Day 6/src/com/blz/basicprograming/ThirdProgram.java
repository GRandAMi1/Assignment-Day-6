package com.blz.basicprograming;

import java.util.Scanner;

public class ThirdProgram {
    public static void main(String[] args) {
        System.out.print("Enter your number to check for Prime number : ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int i=2;
        while (i < userInput && userInput%i!=0){
            i++;
        }
        if (i==userInput){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Non-Prime Number");
        }
    }
}
