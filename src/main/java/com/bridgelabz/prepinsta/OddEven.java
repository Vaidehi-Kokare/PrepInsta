package com.bridgelabz.prepinsta;

import javax.swing.*;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        if(num%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");

    }
}
