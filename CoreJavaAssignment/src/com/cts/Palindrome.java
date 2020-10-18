package com.cts;

import java.util.*;

public class Palindrome {
	
	public static void main(String args[]) {
	
	int n;
	int rem;
	int t=0;
	int temp;
	
	
	System.out.println("Enter the number to check palidrome : ");
	
	Scanner s = new Scanner(System.in);
	n = s.nextInt();
	
	temp = n;
	s.close();
	
	while(n!=0) {
		
		rem = n % 10;
		t = t * 10 + rem;
		n = n/10;
		
	}
	if(temp==t)
		System.out.println(temp +" is a palindrome");
	else
		System.out.println(temp +" is not a palidrome");
	
	
	
	}
}
