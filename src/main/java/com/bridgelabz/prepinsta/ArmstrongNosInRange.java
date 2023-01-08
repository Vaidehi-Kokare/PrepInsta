package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class ArmstrongNosInRange {
    static int length(int num){
        int len = 0;
        while(num!=0){
            len++;
            num=num/10;
        }
        return len;
    }
    static void armstrong(int u, int l){
        int d, len, sum = 0;

        for(int i =l;i<=u;i++){
            int temp = i;
            len = length(i);
            while (temp != 0) {
                d = temp % 10;
                sum += (int) Math.pow(d, len);
                temp = temp / 10;
            }
            if(i == sum){
                System.out.println(i + " ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lower limit");
        int l = scanner.nextInt();
        System.out.println("Enter upper limit");
        int u = scanner.nextInt();
        System.out.println("Armstrong Numbers between " + l + " and " + u + " is: " );
        armstrong(u,l);
    }
}