package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class FriendlyPair {
    static int sumOfFactors(int num){
        int sum = 0 ;
        for(int i=1; i<num; i++) {
            if(num%i==0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        int sum1,sum2,r1,r2;
        sum1=sumOfFactors(num1);
        sum2=sumOfFactors(num2);

        r1= sum1/num1;
        r2= sum2/num2;

        if(r1==r2)
            System.out.println(num1 + " and " + num2 + " are friendly pair.");
        else
            System.out.println(num1 + " and " + num2 + " are not friendly pair.");

    }
}
