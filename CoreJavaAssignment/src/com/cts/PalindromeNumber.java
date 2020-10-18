package com.cts;

import java.util.Scanner;

public class PalindromeNumber {
	 public static void main(String[] args) {
		 
	        int rem, rev= 0, temp;
	    	Scanner sc= new Scanner(System.in);
			System.out.println("Enter any number:");
			int num=sc.nextInt();
	        temp = num;
	 
	        
	        while( num != 0 )
	        {
	            rem= num % 10;
	            rev= rev * 10 + rem;
	            num=num/10;
	        }
	 
	        
	        if (temp == rev)
	            System.out.println(temp + " is a palindrome.");
	        else
	            System.out.println(temp + " is not a palindrome.");
	    }
}
