package com.test;

import java.io.UnsupportedEncodingException;

public class Test {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println("main begin");
		User user = new User();
		user.print();
		System.out.println("main end");
	}
}
