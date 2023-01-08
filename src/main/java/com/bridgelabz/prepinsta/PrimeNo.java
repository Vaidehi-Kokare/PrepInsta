package com.bridgelabz.prepinsta;


import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scanner.nextInt();
        int flag = 0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                System.out.println(n + " is not prime no.");
                flag = 1;
                break;
            }
        }
        if(flag==0)
            System.out.println(n + " is prime no.");
    }

}
