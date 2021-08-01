package com.blz.basicprograming;

import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        System.out.print("Number of elements you want in Fibonacci Series : ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int arr[] = new int[userInput];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i < userInput; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        for (int i = 0; i < userInput; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
