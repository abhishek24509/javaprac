package com.abhishek.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibona {
	void fibonacci(int n){
		int n1=0,n2=1;
		int n3=0;
		if(n==1){
			System.out.print("Nth Term : "+n1);
		}else if(n==2){
			System.out.println("Nth Term : "+n2);
				}else {
						for(int i=1;i<=n-2;i++){
						n3=n1+n2;
						n1=n2;
						n2=n3;
					}
				System.out.println("Nth term : "+n3);
				}
			
	}
	public static void main(String... args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter n : ");
			String input = br.readLine();
			int n = Integer.parseInt(input);
			if(n>0){
			fibona obj = new fibona();
			obj.fibonacci(n);
			}else {System.out.println("Enter n >0");}
		}catch(IOException excp){
			excp.printStackTrace();
		}
	}
}
