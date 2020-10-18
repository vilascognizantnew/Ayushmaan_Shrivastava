package com.cts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddIntegersInArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//Store size of the array
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(br.readLine());
		if(size<=0){
			System.out.println("Invalid input for size!!");
		}
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			System.out.println("Enter number for index "+i+": ");
			arr[i] = Integer.parseInt(br.readLine());;
		}
		for(int i = 0; i < size; i++){
			if(arr[i]%2==0){
				System.out.printf("%d at index %d is an even number.\n",arr[i],i);
			}
			else{
				System.out.printf("%d at index %d is an odd number.\n",arr[i],i);
			}
		}
	}

}
