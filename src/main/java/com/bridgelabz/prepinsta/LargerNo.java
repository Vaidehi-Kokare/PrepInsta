package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class LargerNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number");
        int b = scanner.nextInt();
        if(a>b)
            System.out.println(a + " is the greatest no");
        else
            System.out.println(b + " is the greatest no");
    }
}
