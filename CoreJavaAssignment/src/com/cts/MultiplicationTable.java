package com.cts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTable {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Store size of the array
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number for which to print multiplication table: ");
		int n = Integer.parseInt(br.readLine());
		if (n <= 0) {
			System.out.println("Invalid input!!");
		}
		System.out.println("Multiplication tablen using for loop:");
		for(int i = 1; i <= 10; i++){
			System.out.println(n+" * "+i+" = "+(n*i));
		}
		System.out.println("\nMultiplication tablen using while loop:");
		int iter = 1;
		while(iter<=10){
			System.out.println(n+" * "+iter+" = "+(n*iter));
			iter++;
		}
		iter = 1;
		System.out.println("\nMultiplication tablen using do while loop:");
		do{
			System.out.println(n+" * "+iter+" = "+(n*iter));
			iter++;
		}while(iter<=10);
	}

}
