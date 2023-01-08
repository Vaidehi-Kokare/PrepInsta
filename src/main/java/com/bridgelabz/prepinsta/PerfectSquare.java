package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scanner.nextInt();
        if (Math.ceil(Math.sqrt(n)) == Math.floor(Math.sqrt(n)))
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}
