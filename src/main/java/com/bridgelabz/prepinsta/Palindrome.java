package com.bridgelabz.prepinsta;


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        int rev=0,rem, temp=num;
        while(num!=0){
            rem = num % 10;
            rev= rev * 10 + rem;
            num = num/10;
        }
        if(temp==rev)
            System.out.println("Number is a palindrome");
        else
            System.out.println("Number is not a palindrome");
    }
}
