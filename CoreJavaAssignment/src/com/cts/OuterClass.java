package com.cts;

public class OuterClass {
	private int cx =20;
	
	public class InnerClass{
		private int cx = 30; //local variable has more scope hence 30 will be printed
		public void display() {
		
		System.out.println("CX val = " +cx);//30 will print
		System.out.println("CX val = " +OuterClass.this.cx);//to give ref to outer class variable hence 20 will print
		OuterClass.this.display();
		}
	}
//outer class display function	
public void display() {
		
		
		System.out.println("CX val = " +OuterClass.this.cx);
		
		}

}
