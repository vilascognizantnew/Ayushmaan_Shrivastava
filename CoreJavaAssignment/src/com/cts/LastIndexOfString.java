package com.cts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastIndexOfString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter original string: ");
		String str = br.readLine();
		System.out.println("Enter the string to be searched: ");
		String searchStr = br.readLine();
		StringBuffer sb1 = new StringBuffer(str);
		int lastIndex = sb1.lastIndexOf(searchStr);
		System.out.println("Last index of given search string is:"+ Integer.toString(lastIndex));
	}
}
