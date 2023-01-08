package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class PerfectNo {
    static boolean perfectNo(int num) {
        int sum=0;
        for (int i = 1; i<num; i++) {
            if(num%i==0) {
                sum=sum +i;
            }
        }
        if(sum==num)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scanner.nextInt();
        if(perfectNo(num))
            System.out.println(num + " is perfect number.");
        else
            System.out.println(num + " is not perfect number.");
    }
}
