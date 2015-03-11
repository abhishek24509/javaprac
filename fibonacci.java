package com.abhishek.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci {
	static int fibo[] = new int[101];
	static void fibona(){
		int n1=0,n2=1,n3=0;
		fibo[1]=n1;
		fibo[2]=n2;
		for(int i =3;i<=100;i++){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			fibo[i]=n3;
		}
	}
	static void printfibo(int n){
		System.out.println(n+"th term : "+fibo[n]);
	}
	public static void main(String... args){
		fibona();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter number of test cases : ");
			String input = br.readLine();
			int terms=Integer.parseInt(input);
			for(int i=1;i<=terms;i++){
			System.out.println("Enter required nth term : ");
			String secip= br.readLine();
			int num=Integer.parseInt(secip);
			if(num>0 && num<=100){
				printfibo(num);
				}else {
					System.out.println("Enter num>0 && <=100");
				}
			}
		}catch(IOException excp){
			excp.printStackTrace();
		}
	}
}
