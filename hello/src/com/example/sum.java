//Program to show method with parameter and return type
package com.example;

public class sum {
	public void sum1() //function without parameter
	{
		System.out.println(10+20);		
	}
	
	public int sum1(int a,int b) // function with parameter and return type
	{
		int c=a+b;
		return c;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum obj1=new sum();
		obj1.sum1();
		int result = obj1.sum1(30,70);
		System.out.println(result);
		
	}

}
