package com.test;

public class User extends UserP {
	
	static String name = getName();
	
	User() {
		System.out.println("org");
	}
	
	private static String getName() {
		System.out.println("static var");
		return "hello";
	} 
	
	static {
		System.out.println("static method");
	}
	
	{
		System.out.println("methodB");
	}
	
	public void print() {
		System.out.println("print");
	}
}
