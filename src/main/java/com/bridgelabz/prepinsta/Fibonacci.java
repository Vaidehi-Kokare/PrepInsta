package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nth number");
        int n = scanner.nextInt();
        int i = 0, num1=0, num2=1;
        while(i<n){
            System.out.print(num1 + " " );
            int num3 = num1+num2;
            //swap
            num1=num2;
            num2=num3;
            i++;
        }
    }
}
