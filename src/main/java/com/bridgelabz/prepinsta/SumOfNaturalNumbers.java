package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lower limit ");
        int l = scanner.nextInt();
        System.out.println("Enter upper limit ");
        int u = scanner.nextInt();
        int sum=0;
        for (; l<=u; l++){
            sum = sum+ l;
        }
        System.out.println("Sum till n th number is " + sum);
    }
}
