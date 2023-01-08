package com.bridgelabz.prepinsta;

import java.util.Scanner;

public class PrimeinRange {
    static boolean isPrime(int n){
        for(int i = 2; i<n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lower limit ");
        int l = scanner.nextInt();
        System.out.println("Enter upper limit ");
        int u = scanner.nextInt();
        for (int i = l; i <= u; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }
}
