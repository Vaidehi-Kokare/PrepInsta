package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class StrongNo {
    static int factorial(int num) {
        int f = 1;
        if(num>1){
            for (int i = 1; i<=num; i++) {
                f=f*i;
            }

            return f;
        }
        else
            return 1;
    }

    static boolean strongNo(int num) {
        int digit, sum=0;
        int temp = num;
        while(temp !=0) {
            digit = temp % 10;
            sum = sum + factorial(digit);
            temp = temp/10;
        }
        if(num == sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scanner.nextInt();
        if(strongNo(num))
            System.out.println(num + " is a Strong number");
        else
            System.out.println(num + " is a not Strong number");
    }
}
