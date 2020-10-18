package com.cts;

public class StringReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String st1 = "The quick brown fox jumps over the lazy dog.";

         
        String st2 = st1.replaceAll("fox", "cat");
       
         
        System.out.println("Original string: " + st1);
        System.out.println("New String: " + st2);

	}

}
