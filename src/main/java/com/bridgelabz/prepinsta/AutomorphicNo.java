package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class AutomorphicNo {
    static int length(int num){
        int len =0;
        while(num != 0){
            len++;
            num = num / 10;
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scanner.nextInt();
        int sq,unit,digit,div;
        sq = num*num;
        digit=length(num);
        div = (int)Math.pow(10,digit);
        unit=sq % div;
        if(unit == num)
            System.out.println(num + " is an automorphic number");
        else
            System.out.println(num + " is not an automorphic number");
    }
}
