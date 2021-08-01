package com.blz.basicprograming;

import java.util.Scanner;

public class FourthProgram {
    public static void main(String[] args) {
        System.out.print("Enter your number to Reverse : ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int number=userInput,reverse=0,remainder;
        while (number!=0){
            remainder=number%10;
            number=(number-remainder)/10;
            reverse=(reverse*10)+remainder;
        }
        System.out.println("Your reversed Number is : " + reverse);
    }
}
