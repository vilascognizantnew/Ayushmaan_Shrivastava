package com.cts;

import java.util.Scanner;

public class NaturalNos {

	public static void main(String[] args) {
		
		int num, c, total = 0;
		
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		s.close();
		for(c=1; c<=num; c++) {
			total = total + c;
		}
		
		System.out.println("Sum of "+num+" natural nos. is = " +total);
		

	}

}
