package com.cts;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "this dog is a damn pretty";

        
        String new_str = str.replace('d', 'f');

       
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);

	}

}
