package com.cts;

public class OuterClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.display();

	}

}
