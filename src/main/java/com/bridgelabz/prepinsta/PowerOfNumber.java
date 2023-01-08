package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        System.out.println("Enter power");
        int pow = scanner.nextInt();
        int ini_pow = pow;
        int res = 1;
        while(pow !=0) {
            res = res*num;
            pow--;
        }
        System.out.println(ini_pow + "th power of " + num + " is: " + res);
    }
}
