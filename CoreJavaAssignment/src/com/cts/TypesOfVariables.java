package com.cts;

public class TypesOfVariables {
	//Instance variable
	int instVar = 10;
	//Class variable
	static int classVar = 20;
	
	public void memberVarFunc(int paramVar){
		int memberVar = paramVar;
		System.out.println(memberVar);
		return;
	}
	
	public static void main(String[] args) {
		//Local variable
		int localVar = 30;
		TypesOfVariables tov = new TypesOfVariables();
		System.out.println("Example of instance variable: "+Integer.toString(tov.instVar));
		System.out.println("Example of class variable: "+Integer.toString(TypesOfVariables.classVar));
		System.out.println("Example of local variable: "+Integer.toString(localVar));
		System.out.print("Example of method parameters: ");
		tov.memberVarFunc(40);
	}

}
