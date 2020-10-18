package com.cts;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {

        int originalNumber, r, result = 0;
        Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
        originalNumber = num;

        while (originalNumber != 0)
        {
            r = originalNumber % 10;
            result += Math.pow(r, 3);
            originalNumber /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
