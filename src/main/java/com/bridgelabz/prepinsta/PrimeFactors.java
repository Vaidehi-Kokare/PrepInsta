package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        System.out.println("Prime Factors of " + num + " are:");
        for(int i=2; i<=num; i++) {
            while(num%i==0){
                System.out.println(i + " ");
                num = num/i;
            }

        }
    }
}
