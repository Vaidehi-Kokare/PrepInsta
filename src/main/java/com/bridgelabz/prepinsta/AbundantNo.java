package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class AbundantNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++) {
            if(num%i==0){
                sum = sum + i;
            }
        }
        if(sum>num)
            System.out.println("It is an Abundant number");
        else
            System.out.println("It is not an Abundant number");
    }
}
