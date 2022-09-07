/* Variables
3 types of variables in java
1. Instance variable
2. Static variable
3. Local variable 
*/

package com.example;

public class students {
	
String name; // instance variable
int number; // instance variable
String email; // instance variable
static int collegeId; // static variable declaration

public void print()
{
	System.out.println("name="+name+" "+"number="+number+" "+"email="+email+"College Id="+collegeId);
	int i= 100; // Local variable declaration and initialization
	String name1= "Samyukta"; // Local variable declaration and initialization
	System.out.println(i+" "+name1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		
		students obj1=new students();
		obj1.name= "Monisha";
		obj1.number= 27;
		obj1.email = "test@gmail.com";
		obj1.collegeId = 100; // creating object for static variable and assigning value
		/*students.collegeId = 100; Static variable can be accessed with class name. compile
		throws warning. but static variables cannot be updated with class name. 
		Static variables can be updated by creating objects. */
		obj1.print();
		
		students obj2=new students();
		obj2.collegeId = 200;
        obj2.print();


	}

}
