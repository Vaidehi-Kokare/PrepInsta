package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class ArmstrongNo {
    static int length(int num){
        int len = 0;
        while(num!=0){
            len++;
            num=num/10;
        }
        return len;
    }
    static boolean armstrong(int len,int num){
        int d, sum = 0;
        int temp = num;
        while (temp != 0) {
            d = temp % 10;
            sum += (int) Math.pow(d,len);
            temp = temp / 10;
        }
        if(num == sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number");
            int num = scanner.nextInt();
            int no_of_digits = length(num);
            if (armstrong(no_of_digits,num))
                System.out.println("It is an Armstrong number");
            else
                System.out.println("it is not an Armstrong number");
        }
    }

