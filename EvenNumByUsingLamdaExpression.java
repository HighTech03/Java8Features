package com.test;

import java.util.Scanner;

public class EvenNumByUsingLamdaExpression 
{
	void display()
	{
		InterfaceA x=(int a)->{
			if(a%2==0)
			{
				System.out.println(a+" is Even Number");
			}
			else
			{
				System.out.println(a+" is Not Even Number");
			}
		};
		x.meth1(21);
	}

	public static void main(String[] args) 
	{
	   new EvenNumByUsingLamdaExpression().display();	

	}

}
