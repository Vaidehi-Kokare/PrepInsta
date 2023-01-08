package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class HarshadNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scanner.nextInt();
        int sum=0,digit;
        int temp = num;
        while(num!=0){
            digit = num %10;
            sum = sum + digit;
            num/=10;
        }
        if(temp% sum==0)
            System.out.println(temp +" is a Harshad number");
        else
            System.out.println(temp +" is not a Harshad number");
    }
}
