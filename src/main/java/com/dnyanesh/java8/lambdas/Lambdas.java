package com.dnyanesh.java8.lambdas;

public class Lambdas {

	public static void main(String[] args) {

		StringLenLambda myLambda = s -> s.length();
		int len = myLambda.len("Welcome");
		System.out.println(len);
	}

	interface StringLenLambda {
		int len(String s);
	}

}
