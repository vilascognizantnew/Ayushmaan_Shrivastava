package com.cts;

import java.util.Scanner;

public class Factorial {
	 public static void main(String args[]){
         int i, f=1, number;
         System.out.println("Enter the number to which you need to find the factorial:");
         Scanner sc = new Scanner(System.in);
         number = sc.nextInt();

         for(i = 1; i<=number; i++) {
            f = f * i;
         }
         System.out.println("Factorial of the given number is: "+f);
      }
   }

