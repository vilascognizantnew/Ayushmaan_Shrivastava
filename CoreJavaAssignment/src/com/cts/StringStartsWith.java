package com.cts;

public class StringStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Mango is favorite fruit.";
        String str2 = "Orange is also my favorite fruit.";

      
        String startStr = "Mango";

       
        boolean starts1 = str1.startsWith(startStr);
        boolean starts2 = str2.startsWith(startStr);

        
        System.out.println( str1 + " starts with " +
             startStr + "? " + starts1);
        System.out.println(str2 + " starts with " +
             startStr + "? " + starts2);

	}

}
