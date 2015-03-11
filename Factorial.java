package com.abhishek.prac;

public class Factorial {
	private static long fact(int n){
		if(n==0)
			return 1;
		else
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		System.out.println("Factorial of 20 = "+fact(20));
	}

}
