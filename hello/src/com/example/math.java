package com.example;

public class math {
	int a,b,c;
	public void sum()
	{	c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
math obj1 = new math();
obj1.a=10;
obj1.b=30;
obj1.sum();

math obj2 = new math();
obj2.a=15;
obj2.b=20;
obj2.sum();
}
}
