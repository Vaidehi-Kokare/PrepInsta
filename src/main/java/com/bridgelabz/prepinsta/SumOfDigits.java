package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        int d, sum = 0;
        while(num!=0){
            d = num % 10;
            sum += d;
            num = num/10;
        }
        System.out.println("Sum of digits is " + sum);
    }
}
