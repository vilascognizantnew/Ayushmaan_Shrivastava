package com.cts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxAndMinInArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Store size of the array
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(br.readLine());
		if (size <= 0) {
			System.out.println("Invalid input for size!!");
		}
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter number for index " + i + ": ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < size; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("maximum valur in the array is "+max+", and minimum value in the array is: "+min);
	}

}
