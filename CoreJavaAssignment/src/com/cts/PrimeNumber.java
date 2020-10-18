package com.cts;

import java.util.Scanner;

public class PrimeNumber {

	
	public static void main(String args[])
	   {		
		int temp;
		boolean p=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int num=sc.nextInt();
	        //sc.close();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      p=false;
		      break;
		   }
		}
		
		if(p)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   }
}
