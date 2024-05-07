package com.test;

public class ClassA 
{
	void display()
	{
		FunctionalInterfaceDemo x=()-> System.out.println("Hello Wolrd");
		x.meth1();
		
		FunctionalInterfaceDemo1 y=(int n,String s)->System.out.println(n+" "+s);
		y.meth2(20, "Java is Awesome");
		
	}
	public static void main(String[] args) {
		new ClassA().display();
	}

}
