package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class LargerOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number");
        int b = scanner.nextInt();
        System.out.println("Enter 3rd number");
        int c = scanner.nextInt();
        if((a>b)&&(a>c))
            System.out.println(a + " is the greatest no");
        else
            if ((b>c)&&(b>a))
                System.out.println(b + " is the greatest no");
            else
                System.out.println(c + " is the greatest no");
    }
}
