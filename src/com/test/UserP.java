package com.test;

public class UserP {
	
	static String name = getSName();
	
	UserP() {
		System.out.println("orgP");
	}
	
	private static String getSName() {
		System.out.println("static varP");
		return "hello";
	} 
	
	static {
		System.out.println("static methodP");
	}
	
	{
		System.out.println("methodBP");
	}
}
