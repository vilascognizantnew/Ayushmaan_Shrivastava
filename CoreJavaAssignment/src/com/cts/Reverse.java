package com.cts;

import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int reverseNum=0;
		
		System.out.println("Enter the number you want to reverse: ");
		
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		s.close();
		
		while(num!=0)
		{
			reverseNum = reverseNum * 10;
			reverseNum = reverseNum + num%10;
			num = num/10;
		}
		
		System.out.println("Reverse of number is : " +reverseNum);

	}

}
