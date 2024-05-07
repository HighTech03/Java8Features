package com.test;

public class ClassA 
{
	void display()
	{
		FunctionalInterfaceDemo x=()-> System.out.println("Hello Wolrd");
		x.meth1();
	}
	public static void main(String[] args) {
		new ClassA().display();
	}

}
