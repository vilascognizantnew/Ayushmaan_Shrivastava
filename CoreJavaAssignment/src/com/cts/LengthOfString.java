package com.cts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LengthOfString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter original string: ");
		String str = br.readLine();
		int length = str.length();
		System.out.println("Length of the given string is:"+ Integer.toString(length));
	}
}
